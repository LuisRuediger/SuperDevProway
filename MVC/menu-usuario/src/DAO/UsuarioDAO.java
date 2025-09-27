package DAO;

import model.Usuario;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() throws Exception {

        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            System.out.println("Problema ao abrir conexão na DAO!");
            e.printStackTrace();
        }

    }

    public boolean cadastrar(Usuario usuario) throws Exception {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO usuario (nome, email, senha, tentativas, status) VALUES (?, ?, MD5(?), ?, ?)";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, 0);
            stmt.setBoolean(5, true);

            stmt.execute();

            return true;

        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(this.conn, stmt, null);
        }
    }

    public Usuario login(String email, String senha) throws Exception {
        Usuario usuarioValido = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = MD5(?)";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioValido = new Usuario();

                usuarioValido.setId(rs.getInt("id"));
                usuarioValido.setNome(rs.getString("nome"));
                usuarioValido.setEmail(rs.getString("email"));
                usuarioValido.setStatus(rs.getBoolean("status"));
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(this.conn, stmt, null);
        }

        return usuarioValido;
    }

    public boolean verificarEmail(String email) throws Exception {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario WHERE email = ?";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "email");

            rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }

    public void adicionarTentativa(String email) throws Exception {
        PreparedStatement stmt = null;
        String sql = "UPDATE usuario SET tentativas = tentativas + 1 WHERE email = ?";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, email);

            stmt.execute();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
























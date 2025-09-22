package DAO;

import model.Paciente;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO implements GenericDAO {

    private Connection conn;

    public PacienteDAO() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public List<Object> getAll() {
        List<Object> pacienteList = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT id, nome, convenio FROM paciente ORDER BY id";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()){
                Paciente paciente = new Paciente();

                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setConvenio(rs.getString("convenio"));

                pacienteList.add(paciente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConnection(stmt, rs);
        }

        return pacienteList;
    }

    @Override
    public Object getById(int id) {
        Paciente pacienteEncontrado = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT id, nome, convenio WHERE id = ?";

        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                pacienteEncontrado = new Paciente();

                pacienteEncontrado.setId(rs.getInt("id"));
                pacienteEncontrado.setNome(rs.getString("nome"));
                pacienteEncontrado.setConvenio(rs.getString("convenio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConnection(stmt, rs);
        }

        return pacienteEncontrado;
    }

    @Override
    public Boolean insert(Object object) throws Exception {
        Paciente paciente = (Paciente) object;

        PreparedStatement stmt = null;

        String sql = "INSERT INTO paciente (nome, convenio) VALUES (?,?)";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getConvenio());

            stmt.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Problemas ao inserir paciente. Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            this.closeConnection(stmt, null);
        }
    }

    @Override
    public Boolean update(Object object) {
        Paciente paciente = (Paciente) object;

        PreparedStatement stmt = null;

        String sql = "UPDATE paciente SET nome = ?, convenio = ? WHERE id = ?";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getConvenio());
            stmt.setInt(3, paciente.getId());

            stmt.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("Problemas ao alterar paciente. Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            this.closeConnection(stmt, null);
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM paciente WHERE id = ?";

        try {
            stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConnection(stmt, null);
        }
    }

    private void closeConnection(PreparedStatement stmt, ResultSet rs) {
        try {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception ex) {
            System.out.println("Problemas ao fechar a conexão. Erro: " + ex.getMessage());
        }
    }
}

package DAO;

import Model.Paciente;
import Util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public Boolean insert(Object object) {
        Paciente paciente = new Paciente();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO paciente \n" +
                "\t(nome, idade, telefone, tiposanguineo, doador, convenio) \n" +
                "VALUES \n" +
                "\t(?, ?, ?, ?, ?, ?),";

        try {
            stmt.setString(1, paciente.getNome());
            stmt.setInt(2, paciente.getIdade());
            stmt.setString(3, paciente.getTelefone());
            stmt.setString(4,paciente.getTipoSanguineo());
            stmt.setBoolean(5, paciente.getDoador());
            stmt.setString(6, paciente.getConvenio());

            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            this.closeConnection(stmt, null);
        }
    }

    @Override
    public List<Object> getAll() {

        List<Object> pacienteList = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM paciente ORDER BY id";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();

                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setTipoSanguineo(rs.getString("tipoSanguineo"));
                paciente.setDoador(rs.getBoolean("doador"));
                paciente.setConvenio(rs.getString("convenio"));

                pacienteList.add(paciente);
            }


        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConnection(stmt, rs);
        }

        return pacienteList;
    }


    private void closeConnection(PreparedStatement stmt, ResultSet rs) {
        try {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception ex) {
            System.out.println("Problemas ao fechar a conexão. Erro: " + ex.getMessage());
        }
    }
}

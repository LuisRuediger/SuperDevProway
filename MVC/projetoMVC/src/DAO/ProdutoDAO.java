package DAO;

import model.Produto;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements GenericDAO {

    //
    private Connection conn;

    public ProdutoDAO() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Object> getAll() {

        List<Object> produtoList = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto ORDER BY codigo";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            // rs.next() vai buscar o próximo registro encontrado no SELECT anterior
            // para cada registro encontrado, será executado o bloco abaixo (Fica como true caso ainda  tenha linhas no select)
            while (rs.next()){
                // Declaro um objeto da classe Produto para ser populado com as informações do bacno
                Produto produto = new Produto();

                // Fazendo um match entre o nome da coluna no banco de dados com o nome do atributo
                produto.setId(rs.getInt("codigo"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setStatus(rs.getBoolean("status"));

                // Inserir o objeto produto na lista
                produtoList.add(produto);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão. Erro: " + ex.getMessage());
            }
        }

        return produtoList;
    }

    @Override
    public Produto getById(int id) {

        Produto produtoEncontrado = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto WHERE codigo = ?";

        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                produtoEncontrado = new Produto();

                produtoEncontrado.setId(rs.getInt("codigo"));
                produtoEncontrado.setDescricao(rs.getString("descricao"));
                produtoEncontrado.setPreco(rs.getDouble("preco"));
                produtoEncontrado.setStatus(rs.getBoolean("status"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão. Erro: " + ex.getMessage());
            }
        }

        return produtoEncontrado;
    }

    @Override
    public Boolean insert(Object object) {

        // Convertendo o objeto em um objeto do tipo especifico
        Produto produto = (Produto) object;

        // Instanciando um objeto da classe que "formata" o comando sql
        PreparedStatement stmt = null;

        // Escrevendo a sql para inserir um novo registro na tabela 'produto'
        String sql = "INSERT INTO produto (descricao, preco, status) VALUES (?,?,?)";

        try {
            // Transforma a String sql em um comando válido para ser executado no banco
            stmt = this.conn.prepareStatement(sql);

            // Inserindo valor em cada ponto de interrogação de forma sequencial
            // onde cada ? refere-se à uma coluna da tabela 'produto'
            // atentando para o tipo de cada coluna com o tipo do valor a ser enviado
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setBoolean(3, produto.isStatus());

            // executa a sql no banco
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Problemas ao inserir produto. Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão. Erro: " + ex.getMessage());
            }
        }
    }

    @Override
    public Boolean update(Object object) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}

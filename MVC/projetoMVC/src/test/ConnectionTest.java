package test;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        if (connection != null) {
            System.out.println("A conexão foi estabelecida");
        } else {
            System.out.println("Algum problema!");
        }

        connection.close();
    }
}

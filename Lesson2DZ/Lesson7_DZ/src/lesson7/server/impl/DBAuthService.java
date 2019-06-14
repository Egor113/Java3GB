package lesson7.server.impl;

import lesson7.server.api.AuthService;
import lesson7.server.model.Client;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class DBAuthService implements AuthService {
    private Set<Client> users = new LinkedHashSet<>();

    public DBAuthService() {

    }

    @Override
    public Client authenticate(String login, String pass) {
        Connection conn = null;
        PreparedStatement ps = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/chat");
            stmt = conn.createStatement();
            //stmt.execute("DELETE FROM Students");
            String sqlRead = "SELECT * FROM Students";
            ResultSet rs = stmt.executeQuery(sqlRead);
            while (rs.next()) {
                System.out.print(rs.getString("Name") + ": " + rs.getInt("Score") + "\n");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return new Client(login,pass,"sss");
    }
}

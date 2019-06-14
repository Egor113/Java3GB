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

            ResultSet rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                if (rs.getString("name").equals(login) && rs.getString("password").equals(pass)){
                    return new Client(rs.getString("name"),rs.getString("password"),rs.getString("nick"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

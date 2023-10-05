package repos;

import models.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClientDaoImpl implements ClientDao{
    Connection con = Database.getConnection();
    PreparedStatement ps = con.prepareStatement("");

    public ClientDaoImpl() throws SQLException {
    }
}

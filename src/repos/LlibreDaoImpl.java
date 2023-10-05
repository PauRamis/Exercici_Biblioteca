package repos;

import models.Llibre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LlibreDaoImpl implements LlibreDao{
    Connection con = Database.getConnection();
    PreparedStatement ps = con.prepareStatement("");

    public LlibreDaoImpl() throws SQLException {
    }
}

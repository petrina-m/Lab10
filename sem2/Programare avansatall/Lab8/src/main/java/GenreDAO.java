
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40757
 */
public class GenreDAO {
     DatabaseClient client;

    private PreparedStatement addStmt = null;

    private PreparedStatement searchByIdStmt = null;
    private PreparedStatement searchByNameStmt = null;

    public GenreDAO(DatabaseClient client) {
        this.client = client;
    }

    public void add(Integer id, String genre) throws SQLException {
        if (addStmt == null) {
            String sql = "INSERT INTO genres VALUES(?, ?)";
            addStmt = client.getConnection().prepareStatement(sql);
        }
            addStmt.setInt(1, id);
            addStmt.setString(2, genre);
            addStmt.execute();
      
    }
    
    public Genre searchById(int id) throws SQLException
    {
     
        {
            String sql="SELECT * FROM genres where id= ?";
            searchByIdStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByIdStmt.setInt(1, id);
        Genre GenreResult=new Genre();
       ResultSet rs=searchByIdStmt.executeQuery();
       
       GenreResult.setId( rs.getInt("id"));
       GenreResult.setName( rs.getString("title"));
       
      return GenreResult; 
    }
    
    public Genre searchByName(String name) throws SQLException
    {
     
        {
            String sql="SELECT * FROM genres where id= ?";
            searchByNameStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByNameStmt.setString(1, name);
        Genre GenreResult=new Genre();
       ResultSet rs=searchByNameStmt.executeQuery();
       
       GenreResult.setId( rs.getInt("id"));
       GenreResult.setName( rs.getString("title"));
       
      return GenreResult; 
    }
}

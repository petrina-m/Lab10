
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
public class DirectorDAO {
      DatabaseClient client;

    private PreparedStatement addStmt = null;

    private PreparedStatement searchByIdStmt = null;
    private PreparedStatement searchByNameStmt = null;

    public DirectorDAO(DatabaseClient client) {
        this.client = client;
    }
    
    public void add(Integer id, String name) throws SQLException {
        if (addStmt == null) {
            String sql = "INSERT INTO directors VALUES(?, ?)";
            addStmt = client.getConnection().prepareStatement(sql);
        }
            addStmt.setInt(1, id);
            addStmt.setString(2, name);
            addStmt.execute();
      
    }
    
    public Director searchById(int id) throws SQLException
    {
     
        {
            String sql="SELECT * FROM directors where id= ?";
            searchByIdStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByIdStmt.setInt(1, id);
        Director DirectorResult=new Director();
       ResultSet rs=searchByIdStmt.executeQuery();
       
       DirectorResult.setId( rs.getInt("id"));
       DirectorResult.setName( rs.getString("name"));
       
      return DirectorResult; 
    }
    
    public Director searchByName(String name) throws SQLException
    {
     
        {
            String sql="SELECT * FROM directors where id= ?";
            searchByNameStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByNameStmt.setString(1, name);
        Director DirectorResult=new Director();
       ResultSet rs=searchByNameStmt.executeQuery();
       
       DirectorResult.setId( rs.getInt("id"));
       DirectorResult.setName( rs.getString("name"));
       
      return DirectorResult; 
    }
}

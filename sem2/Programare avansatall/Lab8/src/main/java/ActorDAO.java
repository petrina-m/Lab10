
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
public class ActorDAO {
   
    DatabaseClient client;

    private PreparedStatement addStmt = null;

    private PreparedStatement searchByIdStmt = null;
    private PreparedStatement searchByNameStmt = null;

    public ActorDAO(DatabaseClient client) {
        this.client = client;
    }
    
    public void add(Integer id, String name) throws SQLException {
        if (addStmt == null) {
            String sql = "INSERT INTO actors VALUES(?, ?)";
            addStmt = client.getConnection().prepareStatement(sql);
        }
            addStmt.setInt(1, id);
            addStmt.setString(2, name);
            addStmt.execute();
      
    }
    
    public Actor searchById(int id) throws SQLException
    {
     
        {
            String sql="SELECT * FROM actors where id= ?";
            searchByIdStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByIdStmt.setInt(1, id);
        Actor ActorResult=new Actor();
       ResultSet rs=searchByIdStmt.executeQuery();
       
       ActorResult.setId( rs.getInt("id"));
       ActorResult.setName( rs.getString("name"));
       
      return ActorResult; 
    }
    
    public Actor searchByName(String name) throws SQLException
    {
     
        {
            String sql="SELECT * FROM actors where id= ?";
            searchByNameStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByNameStmt.setString(1, name);
        Actor ActorResult=new Actor();
       ResultSet rs=searchByNameStmt.executeQuery();
       
       ActorResult.setId( rs.getInt("id"));
       ActorResult.setName( rs.getString("name"));
       
      return ActorResult; 
    }
}

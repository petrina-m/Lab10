
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
public class MovieDAO {
    private final DatabaseClient client;

    private PreparedStatement addStmt = null;
    
    private PreparedStatement searchByIdStmt = null;
    private PreparedStatement searchByTitleStmt = null;
    
    public MovieDAO(DatabaseClient client) {
        this.client = client;
    }
    
    public void add(Integer id, String title, String release_date, Integer duration, Float score) throws SQLException 
    {
        if (addStmt == null) {
            String sql = "INSERT INTO movies VALUES(?, ?, ?, ?, ?)";
            addStmt = client.getConnection().prepareStatement(sql);
        }
            addStmt.setInt(1, id);
            addStmt.setString(2, title);
            addStmt.setDate(3, java.sql.Date.valueOf(release_date));
            addStmt.setInt(4, duration);
            addStmt.setFloat(5, score);

            addStmt.execute();
        
    }
    
    public Movie searchByTitle(String title) throws SQLException
    {
        if(searchByTitleStmt==null)
        {
            String sql="SELECT * FROM movies where title= ?";
            searchByTitleStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByTitleStmt.setString(1, title);
       Movie MovieResult=new Movie();
       ResultSet rs=searchByTitleStmt.executeQuery();
       
       MovieResult.setId( rs.getInt("id"));
       MovieResult.setTitle( rs.getString("title"));
       
       MovieResult.setRelease_date( rs.getDate("release_date"));
       MovieResult.setDuration( rs.getInt("duration"));
       MovieResult.setScore( rs.getFloat("score"));
       
      return MovieResult;  
    }
    
    public Movie searchById(int id) throws SQLException
    {
     
        {
            String sql="SELECT * FROM movies where id= ?";
            searchByIdStmt=client.getConnection().prepareStatement(sql);
        }
        
       searchByIdStmt.setInt(1, id);
       Movie MovieResult=new Movie();
       ResultSet rs=searchByIdStmt.executeQuery();
       
       MovieResult.setId( rs.getInt("id"));
       MovieResult.setTitle( rs.getString("title"));
       
       MovieResult.setRelease_date( rs.getDate("release_date"));
       MovieResult.setDuration( rs.getInt("duration"));
       MovieResult.setScore( rs.getFloat("score"));
       
      return MovieResult; 
    }
    
}

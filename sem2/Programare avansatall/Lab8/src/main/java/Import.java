import java.io.BufferedReader;
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40757
 */
public class Import {
 
    /*private static List<Movie> readMoviesFromCSV(String fileName) { 
      List<Movie> movies = new ArrayList<>(); 
      Path pathToFile = Paths.get(fileName);
    
    
    try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
    {
        String line = br.readLine();
         while (line != null) {
             String[] attributes = line.split(",");
             Movie movie = createMovie(attributes);
             
             movies.add(movie);
             line = br.readLine();
            }
    }
    catch(IOException ioe){
         ioe.printStackTrace();
    }
   
    return movies;
    }
    
  private static createMovie(String[] metadata)
        {
            String title=metadata[1]; 
            
            return new Movie();
        }
*/
}

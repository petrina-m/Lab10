
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
public class findByName {
    private final String EntityName;
    private int id;
    List<Entity> entities;

    public findByName(String EntityName) {
        this.EntityName = EntityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityName() {
        return EntityName;
    }

    
}

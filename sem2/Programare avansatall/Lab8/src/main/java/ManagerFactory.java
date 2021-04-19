/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40757
 */
public class ManagerFactory {
    private static ManagerFactory single_instance = null;
  
    
  
    
    private ManagerFactory()
    {
       
    }
  
    // static method to create instance of Singleton class
    public static ManagerFactory getInstance()
    {
        if (single_instance == null)
            single_instance = new ManagerFactory();
  
        return single_instance;
    }
}

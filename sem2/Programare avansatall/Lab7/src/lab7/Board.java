/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 40757
 */
public class Board {
    int n;
    List<Token> tokens= new ArrayList<>();

    public void setN(int n) {
        this.n = n;
    }
    public Board(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    
    Token k;
    public void init()
    {
        int i;
        for(i=1;i<=n;i++)
        {
            k=new Token(n,i);
        }
    }
    public Token getToken()
    {
   
        for(Token k: tokens)
        {
         if(k.isAssigned()==false)
         {
             return k;
         }
        
        }
        return k;
    }
}

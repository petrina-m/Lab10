/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Random;
/**
 *
 * @author 40757
 */
public class Token {
   private int valInit;
   private int valFinala;
   private int value;
   private boolean assigned;

    public int getValInit() {
        return valInit;
    }

    public int getValFinala() {
        return valFinala;
    }

    public int getValue() {
        return value;
    }

    public boolean isAssigned() {
        return assigned;
    }
    
    public Token(int n, int valInit) {
        this.valInit = valInit;
        Random rand = new Random();
        valFinala=rand.nextInt(n);
        assigned=false;
        Random rand2 = new Random();
        value=rand2.nextInt(n);
    }
    
}

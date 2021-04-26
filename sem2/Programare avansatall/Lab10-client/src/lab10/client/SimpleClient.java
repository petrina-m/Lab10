/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author 40757
 */
public class SimpleClient {

    public static void main(String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8100; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()))) {
            
            //citesc de la tastatura comanda
            Scanner scanner = new Scanner(System.in);
            String inputString;
            String response;
            do{
             
              inputString = scanner.nextLine();
              out.println(inputString);
              response = in.readLine();
              System.out.println(response);
              
            }
            while(!"exit".equals(inputString));
           
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }
}

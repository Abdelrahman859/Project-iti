/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 *
 * @author 20115
 */
public class Reader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String name="" ;
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
         Writer writer = new FileWriter("D:\\AI Pro\\Java\\Lab\\Reader\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
       
        while(!(name.equals("stop"))) {
        System.out.println("Enter data ");
         name = br.readLine();
        System.out.println("Welcome" + name);
        buffer.write(name + "\n");
     
        }
        
       
        buffer.close();
        
            
          
    }
    }
    


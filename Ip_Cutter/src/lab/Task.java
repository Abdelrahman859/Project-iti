/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author 20115
 */
public class Task {
    public String A;
    
    public Task(){}
          
    public Task(String A) {
        this.A=A;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }
    
    
    
   
    String doOperation() {
        
    
    String []B = A.split("\\.");
    String out = " ";
    
    if (B.length != 4) {
        return "error in input";
                
    }
    
    else {
        out=B[0]+"\n"+B[1]+"\n"+B[2]+"\n"+B[3]+"\n";
        return out;
    }
    }}
      
    


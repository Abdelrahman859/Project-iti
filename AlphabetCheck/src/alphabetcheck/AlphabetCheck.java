/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetcheck;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 *
 * @author 20115
 */
public class AlphabetCheck {
    
    public static boolean check(String s) {
        if (s.length()==0)
            return false;
        else if (s.chars().allMatch(Character::isLetter))
            return true ;
        else 
            return false;
        
     
    }
    

   
    public static void main(String[] args) {

        AlphabetCheck a = new AlphabetCheck();
        System.out.println(a.check(""));
        
        
        
       
        
        
    }
    
}


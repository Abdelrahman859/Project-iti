/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author 20115
 */
public class PyramidsDaoImplementation implements PyramidsDao {
    
List<Pyramids> pyramids = new ArrayList<>();
    
    public PyramidsDaoImplementation(){}
        
    @Override
       public List<Pyramids> readPyramidsFromCsv(String filename) {
        
      
      FileReader fr = null;
         try (BufferedReader br = new BufferedReader(new FileReader("D:\\pyramids.csv"))) {
           
           String line = br.readLine();
           
           
                if (line != null) {
                    line = br.readLine();
                }
                while (line != null) {
                    String []attributes = line.split(",");
                    Pyramids pyr = createPyramid(attributes);
                    pyramids.add(pyr);
                    
                    line = br.readLine();
                
         
                    
                }
         }
    

        catch (IOException ioe) {
           ioe.printStackTrace();
           
       } finally {
       }
        return pyramids ;
       }
    

    
    @Override
    public Pyramids createPyramid (String [] data) {
        String Pharaoh = data[0];
        String Modern_name = data[2];
        String Site = data[4];
        double Height = 0;
        if (data[7] != null && data[7].length()>0)
            Height = Double.parseDouble(data[7]);
        return new Pyramids(Pharaoh, Modern_name, Site, Height);
    }
    
    @Override
    public void Sortfunction(){
        Collections.sort(pyramids,comparing((pyramids1) -> pyramids1.getHeight()));
    }
 
   

    @Override
    public List<Pyramids> getAllPyramids() {
        return pyramids;
        
    }

    @Override
    public Pyramids getPyramid(int num) {
        return pyramids.get(num-1);
       
    }

    @Override
    public void updatePyramid(Pyramids pyramid) {
        pyramids.add(pyramid);
    }

    @Override
    public void deletePyramid(Pyramids pyramid) {
        pyramids.remove(pyramid);
    }
    
  
@Override
    public void mapfunction() {
        HashMap<String,Integer> map = new HashMap<>();
        
        for (Pyramids pr : pyramids) {
            String key = pr.getSite();
            if (map.keySet().contains(key)) {
                map.put(key,map.get(key)+1);
            }
            else {
                map.put(key,1); }
    
}
   map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}

       
         

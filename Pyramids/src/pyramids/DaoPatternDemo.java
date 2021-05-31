/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Abdelrahman Mohamed
 */
public class DaoPatternDemo {
     public static void main(String[] args) {
        
      PyramidsDao PyramidsDao = new PyramidsDaoImplementation();
      List<Pyramids> pyramids = PyramidsDao.readPyramidsFromCsv("D:\\pyramids.csv");
      
      int i =0;
      for (Pyramids p : pyramids) 
      {
          System.out.println("#" +(i++) +p);
      }
       System.out.println("\n\n\n\n");
      
     System.out.println(PyramidsDao.getPyramid(5)); 
     
      System.out.println("\n\n\n\n");
     Pyramids y = new Pyramids ("Boody","Abdelrahman","Benisuef",22);
     PyramidsDao.updatePyramid(y);
     System.out.println("pyramid: Pharaoh : "+ y.getPharaoh() 
                 + ", Modern_name : "+ y.getModern_name()
                 + ", site : " + y.getSite()
                 + ", height : " + y.getHeight());
       System.out.println("\n\n\n\n");
       
      
     Pyramids m =PyramidsDao.getPyramid(63);
     PyramidsDao.deletePyramid(m);
     
      int k =0;
      for (Pyramids p : pyramids) 
      {
          System.out.println("#" +(k++) +p);
      }
      
      System.out.println("\n\n\n\n");
      
      for (Pyramids pyramid : PyramidsDao.getAllPyramids()) {
         System.out.println("pyramid: Pharaoh : "+ pyramid.getPharaoh() 
                 + ", Modern_name : "+ pyramid.getModern_name()
                 + ", site : " + pyramid.getSite()
                 + ", height : " + pyramid.getHeight());
      }
      
      System.out.println("\n\n\n\n");
         
         PyramidsDao.Sortfunction();
          int s =0;
      for (Pyramids p : pyramids) 
      {
          System.out.println("#" +(s++) +p);
      }

      PyramidsDao.mapfunction();
      
      
}
}


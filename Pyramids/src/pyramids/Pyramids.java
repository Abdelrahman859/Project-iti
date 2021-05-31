/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids;

/**
 *
 * @author Emad Osama
 */
public class Pyramids {


     String Pharaoh;
     String Modern_name; 
     String Site;
     double Height;
    

    Pyramids(String Pharaoh, String Modern_name , String Site , double Height){
       this.Pharaoh = Pharaoh;
       this.Modern_name = Modern_name;
       this.Site = Site;
       this.Height = Height;
       
    }
    
     @Override
    public String toString() {
        return "Pyramids{" + "Pharaoh=" + Pharaoh + ", Modern_name=" + Modern_name + ", Site=" + Site + ", Height" + Height + "}";
                
        
    }

    public String getPharaoh() {
       return Pharaoh;
    }

    public void setPharaoh(String Pharaoh) {
       this.Pharaoh = Pharaoh;
    }

    public double getHeight() {
       return Height;
    }

    public void setHeight(float Height) {
       this.Height = Height;
    }
    
     public String getSite() {
       return Site;
    }

    public void setSite(String Site) {
       this.Site = Site;
    }

    public String getModern_name() {
        return Modern_name;
    }

    public void setModern_name(String Modern_name) {
        this.Modern_name = Modern_name;
    }
    
    
    
}

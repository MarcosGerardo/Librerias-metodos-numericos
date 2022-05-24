/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mate;

/**
 *
 * @author Marcos Mata
 */
public class Media {
    public double findMedia(double matriz []){
        Ordenamiento obj=new Ordenamiento();
        double media=0;
        
        for (int i=0; i < matriz.length; i++) {
 media = media + matriz[i];
}
        
        media = media / matriz.length;
    
    return media;
    }
}

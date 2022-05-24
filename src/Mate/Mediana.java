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
public class Mediana {
    
    public double findMediana(double matriz[]){
       double sum = 0;
       double total;
       double avg;
       double mediana;
           for (int i = 0; i < matriz.length; i++)
           {
               sum += matriz[i];
           }
           total = sum;
          

           mediana = matriz[matriz.length/2];
    
        
        return mediana;
    
    }
  
           
    
}

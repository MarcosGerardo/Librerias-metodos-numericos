/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mate;
import  Mate.Ordenamiento;
/**
 *
 * @author Marcos Mata
 */
public class Moda {
    public double findModa(double matriz[]){
        Ordenamiento obj= new Ordenamiento();
        int m=matriz.length;
        double acum, acumX = 0, resultado = -1;
        obj.findOrdenamiento(matriz);
        for (int i = 0; i < m; i++) {
            acum=1;
        
        for (int j = i+1 ; j < m; j++) {
            if(matriz[i]==matriz[j]){
            
        acum++;
        
            }
       
        }
        
         if(acum>acumX){
             acumX=acum;
             resultado=matriz[i];
             
         }
    }
    return resultado;
}
}

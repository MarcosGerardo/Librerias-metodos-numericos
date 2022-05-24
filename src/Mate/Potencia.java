/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mate;


public class Potencia {
    public double findPotencia(double base, double exponente){
        
       double resultado = 1.0;
       double i;
for (i = 1; i<=exponente; i++) {
resultado = resultado * base;
}
        return resultado;
    }
    public double findPote2(double base){
        
       double resultado = 0;
      

resultado = base * base;

        return resultado;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mate;
import Mate.Factorial;
import Mate.Potencia;
public class Seno {
    
    
      public double findSeno(double x)
 
      {
 Potencia pow=new Potencia();
 //Factorial fac=new Factorial();
    int i;
 
         double s = 0;
 
         int signo = 1;
 
 
 
         for(i=1; i<10; i+=2)
 
         {
 
            s += signo* pow.findPotencia(x, i) / factorial(i);
 
            signo = -1;
 
         }
 
 
 
         return s;
    }

    static double factorial(int numero) {
        double factorial = 1.0;

        while (numero != 0) {
            factorial= numero--;
        }

        return factorial;
    }
}
    


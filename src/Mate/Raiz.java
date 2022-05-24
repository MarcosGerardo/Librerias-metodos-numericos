
package Mate;


public class Raiz {
    
    public double findRaiz(double x){
    double k;
    double Raiz = 1.0;
     if(x<0){
            x=x*(-1);
            
            }
        for(k = 1; k < 10; k++){
           Raiz = (Raiz + x/Raiz) / 2;
        }
       
   return Raiz;
   
}
}
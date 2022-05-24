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
public class Ordenamiento {
      public double[] findOrdenamiento(double[] arreglo)
    {
     double  auxiliar;
     double [] arregloOrdenado;
      for(int i = 1; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-1;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
   

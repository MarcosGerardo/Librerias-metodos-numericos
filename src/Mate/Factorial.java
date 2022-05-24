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
public class Factorial {

    
    //int x;
    
 
    public  int findFactorial(int x) {
		if (x < 0) {
			return 0;
		}
 
		
 int factorial = 1;
		while (x > 1) {
			factorial = factorial * x;
			x = x - 1;
		}
 
		return factorial;
	}

    

}

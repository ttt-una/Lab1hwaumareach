package lab2;

import java.util.Scanner;

public class L1ex {
	public static void main(String[] args) {
		
		Scanner vin = new Scanner(System.in);
		float[] M= new float[3] ;
		char[] N={ 'a','b','c'};
		System.out.println("Solve for X \n Equation: aX^2+bx+c=0");
		for(int k=0;k<3;k++) {
			System.out.println("pls give value to "+N[k]);
			M[k]=vin.nextFloat();	
		}

		float a = M[0];
	    float b = M[1];
	    float c = M[2];
	    
	    if(a==0) {
	    	double x = -c/b;
	    	System.out.println("One real root: X = " + x);
	    }
	    else {
		
	    	float delta= (b*b)-(4*c*a);
		
		if (delta>0) {
			 double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	         double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	         System.out.println("Two real roots: X1 = " + x1 + ", X2 = " + x2);	
		}
		else if (delta==0) { 
			 double x = -b / (2 * a);
	         System.out.println("One real root: X = " + x);
		}
		else { 
			System.out.println("ERROR cant calculate");
		}
	    }
		vin.close();
	}	
}
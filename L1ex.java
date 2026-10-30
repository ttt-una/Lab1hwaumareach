package lab2;

import java.util.Scanner;

public class L1ex {

    public static void main(String[] args) {
        Scanner vin = new Scanner(System.in);
        int isPrime = 0;
        
        System.out.print("Input n: ");
        int n = vin.nextInt();
        if(n>2) {
	        System.out.print("All prime numbers from 2 to " + n + ": ");
	
	        for (int i = 2; i <= n; i++) {
	        	isPrime = 1;
	            for (int j = 2; j * j <= i; j++) {
	                if (i % j == 0) {
	                    isPrime = 0;
	                    break;
	                }
	            }
	
	            if (isPrime == 1) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
        }
        else { 
        	 System.out.print("Invalid input");
        }
        vin.close();
    }
}

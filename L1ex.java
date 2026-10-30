package lab2;

import java.util.Scanner;

public class L1ex {
	public static void main(String[] args) {
		
		Scanner vin = new Scanner(System.in);
		int b;
		System.out.print("Enter a number: ");
		int sum=0;
		b=vin.nextInt();
		if (b <0 ) {
			System.out.print("Invalid input");
		}
		else {
			for(int k=1000;k>=b;k--) {
				System.out.print(k+ " ");
				sum=sum+k;
			}
			System.out.println("\nsum is: " +sum);
			float avg= (float)sum/(1000-b+1);
			System.out.println("average is: " +avg);	
		}
		vin.close();
	}	
}
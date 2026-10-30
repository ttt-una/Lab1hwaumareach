package lab2;

import java.util.Scanner;

public class L1ex {
	public static void main(String[] args) {
		
		Scanner vin = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        numbers[0] = vin.nextInt();
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < 5; i++) {
            numbers[i] = vin.nextInt();
            
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
 
        System.out.print("Among all the five input numbers (");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("), min is " + min + " and max is " + max + ".");
        
        vin.close();


	}	
}
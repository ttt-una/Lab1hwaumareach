package lab2;

import java.util.Scanner;

public class L1ex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date;
        
        System.out.print("Input a date in the structure of yyyy-mm-dd:\n");
        date = input.nextLine();
        
        String[] SeperateYearMonthDate = date.split("-");
        
        int year = Integer.parseInt(SeperateYearMonthDate[0]);
        int month = Integer.parseInt(SeperateYearMonthDate[1]);
        int day = Integer.parseInt(SeperateYearMonthDate[2]);
        
        if (SeperateYearMonthDate[0].length() == 4) {
            switch (month) {
                case 2:
                    if (year % 4 == 0) {
                        if (day <= 29) {
                            System.out.print("\nValid");
                            break;
                        }
                    }
                    else {
                        if (day <= 28) {
                            System.out.print("\nValid");
                            break;
                        }
                        else {
                            System.out.print("\nInvalid");
                            break;
                        }
                    }
                
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (day <= 31) {
                        System.out.print("\nValid");
                        break;
                    }
                    else {
                        System.out.print("\nInvalid");
                        break;
                    }
                
                case 4: case 6: case 9: case 11:
                    if (day <= 30) {
                        System.out.print("\nValid");
                        break;
                    }
                    else {
                        System.out.print("\nInvalid");
                        break;
                    }

                default:
                    System.out.print("\nInvalid Month");
                    break;
            }
        }
        else {
            System.out.print("\nInvalid Year");
        }
        input.close();
    }
}

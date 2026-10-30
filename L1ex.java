package lab2;

import java.util.Scanner;

public class L1ex {

    public static void main(String[] args) {
        Scanner vin = new Scanner(System.in);

        String[] courses = {"Math", "English", "Physics", "Programming"};

        float[] scores = new float[4]; 
        
        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming) : ");
        float sum = 0.0f;
        for (int i = 0; i < 4; i++) {
            scores[i] = vin.nextFloat();
            sum += scores[i];
        }

        float maxScore = scores[0];
        float minScore = scores[0];
        
        for (int i = 1; i < 4; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }

        String maxCourses = "";
        int maxCount = 0;
        for (int i = 0; i < 4; i++) {
            if (scores[i] == maxScore) {
                if (maxCount > 0) {
                    maxCourses += " and ";
                }
                maxCourses += courses[i];
                maxCount++;
            }
        }

        String minCourses = "";
        int minCount = 0;
        for (int i = 0; i < 4; i++) {
            if (scores[i] == minScore) {
                if (minCount > 0) {
                    minCourses += " and ";
                }
                minCourses += courses[i];
                minCount++;
            }
        }

        float average = sum / 4.0f;
        System.out.println("Max score is: " + (int)maxScore + " (" + maxCourses + " courses).");
        System.out.println("Min score is: " + (int)minScore + " (" + minCourses + " courses).");
        System.out.println("Average score of this student is: " + average);
        
        vin.close();
    }
}

/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student:   Mary Joy Gazu
 * Matric No: 25/17852
 *
 * Asks for a student's name and the scores for three courses, then
 * shows the total and the average score.
 *
 * Extension exercise: every score must be between 0 and 100. If one of
 * them is not, the program shows an error and does not calculate a result.
 */

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants: these values stay the same while the program runs
        final double MIN_SCORE = 0;
        final double MAX_SCORE = 100;
        final int COURSE_COUNT = 3;

        // Input: nextLine() reads the whole name, including spaces
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        // Input: one score for each course
        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Validation: a score is valid only if it is from 0 to 100
        boolean score1Valid = score1 >= MIN_SCORE && score1 <= MAX_SCORE;
        boolean score2Valid = score2 >= MIN_SCORE && score2 <= MAX_SCORE;
        boolean score3Valid = score3 >= MIN_SCORE && score3 <= MAX_SCORE;

        if (score1Valid && score2Valid && score3Valid) {
            // Processing: add the scores, then divide by the number of courses
            double total = score1 + score2 + score3;
            double average = total / COURSE_COUNT;

            // Output: the result for this student
            System.out.println();
            System.out.println("--- STUDENT RESULT ---");
            System.out.println("Student: " + studentName);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println();
            System.out.println("Invalid score entered. Every score must be from 0 to 100.");
            System.out.println("No result was calculated. Please run the program again.");
        }

        input.close();
    }
}

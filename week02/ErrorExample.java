/*
 * COS 201 - Computer Programming I
 * Week 2 Exercise: Find and Fix the Error
 *
 * Student:   Mary Joy Gazu
 * Matric No: 25/17852
 *
 * The error: the println() statement did not end with a semicolon, so
 * javac stopped with the message "';' expected".
 * The fix: I put the semicolon at the end of the statement. The program
 * now compiles and prints "Learning Java".
 */

public class ErrorExample {

    public static void main(String[] args) {
        System.out.println("Learning Java"); // semicolon added here
    }
}

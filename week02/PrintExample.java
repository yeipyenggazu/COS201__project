/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() and println()
 *
 * Student:   Mary Joy Gazu
 * Matric No: 25/17852
 *
 * print()   shows the text and keeps the cursor on the same line.
 * println() shows the text and then moves the cursor to the next line.
 *
 * What I expected to see before running it (the output matched):
 *     COS 201
 *     Java
 */

public class PrintExample {

    public static void main(String[] args) {
        System.out.print("COS ");   // no new line, so the next text follows on this line
        System.out.println("201");  // finishes the line "COS 201"
        System.out.println("Java"); // appears on a line of its own
    }
}

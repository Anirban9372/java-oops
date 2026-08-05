import java.util.Scanner;

public class LessonTwo {
    static Scanner userInput = new Scanner(System.in);
    // static is defined and new is also defined as a new Scanner
    // object is created and assigned to the variable userInput.
    // Since it is not defined under main class so to get called by
    // main class which is static we also have to call the new
    // scanner with a static variable too.

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        if (userInput.hasNextInt()) { // is the next thing typed in an integer?
            int numberEntered = userInput.nextInt(); // it reads the integer and stores in numberEntered
            System.out.println("You entered: " + numberEntered);
            int nabs = Math.abs(numberEntered);
            int max = Math.max(nabs, numberEntered);
            System.out.println("The absolute value of the number you entered is: " + nabs);
            System.out.println("The maximum value of the number you entered is: " + max);
        } else {
            System.out.println("You didn't enter an integer!!");
        }

    }
}

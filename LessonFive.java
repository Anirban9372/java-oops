import java.util.Scanner;

public class LessonFive {
    static double pi = 3.14569; // class variable
    static int randomNumber; // class variable
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(add(1, 02));
        int d = 5;
        trytochange(d);

        System.out.println(getRandomnum());
        while (true) { // first we print the Random number and then we ask the user to guess the
                       // number. If the user enters a non-integer value, we will keep prompting them
                       // until they enter a valid integer.
            System.out.println("Enter a valid number between 0 and 50");// this is a loop that will keep asking the user
                                                                        // for input until they enter a valid integer.
                                                                        // The hasNextInt() method checks if the next
                                                                        // token in the input is an integer. AN infinite
                                                                        // loop will go on until the user inputs the
                                                                        // right value as the value will be printed
                                                                        // before hand.

            int guess = userInput.nextInt();
            guessNumber(guess);
            if (guess == randomNumber) {
                break;
            }
        }
    }
    // function definition : accessmodifier| static(used when method or function is
    // not under class definition)|returntype(or void)| methodname(arguments)

    public static int add(int x, int y) {
        double smallpi = 3.14; // Local Variable
        double pi = 3.145; // we can overwrite the global variable as local variable but still it will not
                           // change the value globally
        pi = pi + 2; // now it changes the value globally too.
        smallpi = smallpi * 2; // local changes
        int c = x + y;
        return c;

    }

    public static void trytochange(int d) {
        d = d + 1;
        System.out.println("Try to change d " + d);
    }

    public static int getRandomnum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static void guessNumber(int guess) {
        if (guess == randomNumber) { // no need to call randomNumber as it is a global class variable
            System.out.println("Right guess");
        } else {
            System.out.println("Wrong guess");
        }
    }
}

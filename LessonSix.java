import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.imageio.IIOException;

public class LessonSix {
    // This lesson is about exception handling in Java. Exception handling is a
    // mechanism that allows you to handle runtime errors in a graceful manner,
    // without crashing the program. In Java, exceptions are represented by the
    // Throwable class and its subclasses. The most common subclasses of Throwable
    // are Exception and Error. Exceptions can be caught and handled using try-catch
    // blocks, while errors are usually not recoverable and should be avoided.

    // There are type of exceptions. Like RuntimeException, IOException,
    // SQLException, etc. Each type of exception serves a specific purpose and can
    // be handled differently based on the context of the program. It is important
    // to understand the hierarchy of exceptions in Java to effectively manage error
    // handling in your applications.
    // Also like IndexOutOfBoundsException, NullPointerException,
    // ArithmeticException, etc. These are all subclasses of RuntimeException and
    // are unchecked exceptions, meaning they do not need to be declared in a
    // method's throws clause. On the other hand, checked exceptions like
    // IOException and SQLException must be declared or handled explicitly in the
    // code. Understanding the difference between checked and unchecked exceptions
    // is crucial for writing robust Java applications. Also ClassnotFoundException,
    // FileNotFoundException, etc. are also checked exceptions that need to be
    // handled properly to avoid runtime errors. IOExceptions are typically thrown
    // when there is an input/output operation failure, such as when trying to read
    // from a file that does not exist. SQLExceptions are thrown when there is an
    // error in database access or other database-related operations. It is
    // important to handle these exceptions appropriately to ensure the stability
    // and reliability of your application.
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        dividebyzero(2);
        int age = checkValidAge();
        if (age != 0) {
            System.err.println("Age :" + age);
        }
        try {
            getaFile("test.txt");
        } catch (IOException e) {
            System.out.println("IO error occured");
        }
    }

    public static void dividebyzero(int a) {
        try { // try and catch block does testing and find with the different types of errors.
              // OR else an error message will be printed.
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            // handle exception
            System.out.println("Can't be done");
            System.out.println(e.getMessage()); // in built error message
            System.out.println(e.toString()); // in built string error message
            e.printStackTrace(); // prints out where is the error.

        }

    }

    public static int checkValidAge() {
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println("It's not a valid age");
            return 0;
        }
    }

    /*
     * public static void getaFile(String filename) {
     * 
     * try {
     * FileInputStream file = new FileInputStream(filename);
     * } catch (FileNotFoundException e) {
     * System.out.println("File not valid");
     * }
     * // catch (ArithmeticException | IOException e) {
     * // System.out.println("Error ");
     * // }
     * catch (Exception e) {
     * System.out.println("Problmes are there");
     * } finally {
     * System.out.println(" ");
     * }
     * }
     */

    public static void getaFile(String filename) throws IOException, FileNotFoundException {
        FileInputStream file = new FileInputStream(filename);
    }

}

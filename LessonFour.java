import java.util.Scanner;

public class LessonFour {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        String countyorn = "Y";
        int x = 1;
        while (countyorn.equalsIgnoreCase("y")) {
            System.out.println(x);
            System.out.println("Continue y or n?");
            countyorn = userinput.nextLine();
            x++;
        }
    }
}

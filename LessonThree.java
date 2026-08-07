
public class LessonThree {
    public static void main(String[] args) {
        int RandomNumber = (int) (Math.random() * 100);
        System.out.println(RandomNumber);
        // We can use math functions from random.
        int x = 1, y = 2;
        int biggerValue = (x > y) ? x : y; // it checks if x is greater than y then it will assign x as biggerValue or
                                           // else it will store y
        System.out.println(biggerValue);

        char grade = 'b';
        switch (grade) {
            case 'A':
                System.out.println("True");
                break;

            default:
                System.out.println("False");
                break;
        }
    }
}

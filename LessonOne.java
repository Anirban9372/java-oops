public class LessonOne {
    static String name = "Anirban";
    static final double pi = 3.14;

    public static void main(String args[]) {
        String z = "Hello World";
        int zstringtoint = Integer.parseInt(z);
        System.out.println(zstringtoint);
        int x = 10;
        String xstring = Integer.toString(x);
        System.out.println(xstring);
        double y = 101.3;
        double yint = (int) y;
        System.out.println(yint);
        System.out.println("Intro to java");
        System.out.println("My name is " + name);
        System.out.println("The value of pi is " + pi);
        System.out.println(Float.MAX_VALUE);
    }
}
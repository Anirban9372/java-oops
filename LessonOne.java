public class LessonOne {
    static String name = "Anirban";
    static final double pi = 3.14;

    public static void main(String args[]) {
        char escapecharacters = '\n';
        System.out.println("Hello World" + escapecharacters + "My name is Anirban");

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

        // byte to string
        byte b = 127;
        String btostring = Byte.toString(b);
        System.out.println(btostring);
        // string to byte
        String s = "127";
        byte stringtobyte = Byte.parseByte(s);
        System.out.println(stringtobyte); // simply parseByte() method is used to convert string to byte in java. It
                                          // takes a string as an argument and returns a byte value.
        // double to int
        double d = 3.14;
        int doubletoint = (int) d;
        System.out.println(doubletoint);
        // int to string
        int a = 123413;
        String inttostring = Integer.toString(a);
        System.out.println(inttostring);
        // string to int by parseInt()
        int stringtoint = Integer.parseInt(inttostring);
        System.out.println(stringtoint); // parse is a method to convert int to string to int in the last step.
        // And all the double conversive methods.
        // Static means variable or methods belonging to t the class rather than being
        // an object or instance to the class. Static variables are shared among all
        // instances of a class. Static methods can be called without creating an
        // instance of the class.

    }
}
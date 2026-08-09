public class LessonSeven {
    public static void main(String[] args) {

        Lesson7Monster Archisman = new Lesson7Monster();
        Archisman.name = "Archisman"; // as name is public under Lesson7Monster class
        // System.out.println(Archisman.attack);
        // The field Lesson7Monster.attack is not visible as it is private and will
        // throw errors.
        System.out.println(Archisman.getAttack()); // here the method getAttack() is public and can be accessed outside
                                                   // the class. Outside the class, we can only access public methods
                                                   // and attributes. We cannot access private methods and attributes.
        // The new keyword is used to create an object of the class. The new keyword
        // allocates memory for the object and returns a reference to that memory. The
        // reference is then assigned to the variable Archisman, which can be used to
        // access the object's attributes and methods.
        // Why we need to use new keyword and use Lesson7Monster() constructor to create
        // an object of the class. The new keyword is used to create an object of the
        // class and allocate memory for it. The constructor is a special method that is
        // called when the object is created and is used to initialize the object's
        // attributes. In this case, we are using the default constructor
        // Lesson7Monster() to create an object of the class without any parameters. If
        // we had defined a constructor with parameters, we would need to use that
        // constructor to create an object of the class and pass in the required
        // parameters.
    }
}

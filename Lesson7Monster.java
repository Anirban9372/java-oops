// This is about Class and Objects
public class Lesson7Monster {
    public final String Tombstone = "Here lies a dead Monster";
    private int health = 500;
    private int movement = 2;
    private int attack = 20; // we are crating private class variable which are actually object attributes
                             // and we are initializing them with some default values. So, when we create an
                             // object of this class, these attributes will be initialized with these default
                             // values.So what is an object and what is a class and how they are related to
                             // each other? A class is a blueprint or template for creating objects. It
                             // defines the properties (attributes) and behaviors (methods) that the objects
                             // created from the class will have. An object is an instance of a class,
                             // meaning it is a specific realization of the class with its own unique values
                             // for the attributes defined in the class.
                             // why we are doing private? Because we want to encapsulate the data and prevent
                             // direct access from outside the class. This is a fundamental principle of
                             // object-oriented programming called encapsulation. By making the attributes
                             // private, we can control how they are accessed and modified through public
                             // methods (getters and setters) if needed. This helps maintain the integrity of
                             // the object's state and allows for better control over how the data is used.
    private int x_position = 0;
    private int y_position = 0;
    private boolean alive = true;
    public String name = "Big Monster"; // we are creating public class variable which is actually object attribute and
                                        // we are initializing it with some default value. So, when we create an object
                                        // of this class, this attribute will be initialized with this default value.

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decrease) {
        // overloading of methods where you need to change the attribute
        int intdecreaseHealth = (int) decrease;
        health = health - intdecreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    // Creating a constructor, which is an initialization method that is called when
    // an object of the class is created. It has the same name as the class and does
    // not have a return type. In this case, we are creating a constructor that
    // takes a String parameter to set the name of the monster when it is created.
    public Lesson7Monster(int health, int movement, int attack) {
        this.health = health;
        this.movement = movement;
        this.attack = attack;
    }

    // If we dont create constructor of any type. This is an default constructor.
    public Lesson7Monster() {

    }

    public Lesson7Monster(int newhealth) {
        health = newhealth;
    }

    public Lesson7Monster(int newattack, int newhealth) {
        this(newhealth); // instructor to the attributes of constructor previously defined.
        attack = newattack;
    }

    public static void main(String[] args) {
        Lesson7Monster Anirban = new Lesson7Monster();
        System.out.println(Anirban.attack + Anirban.y_position + Anirban.x_position); // I can print the private field
                                                                                      // attack as I am under the class

        System.out.println(Anirban.alive);
    }
}

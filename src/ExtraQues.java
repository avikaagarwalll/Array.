/*class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ExtraQues extends Car {

    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ExtraQues();
       System.out.print(car.drive());
    }
}*/
//Whenever a class gets instantiated, the constructor of its base classes (the constructor of the
// root of the hierarchy gets executed first) gets invoked before the constructor of the instantiated class.

//q2


/*class Base {
    public Base() {
        System.out.print("Base ");
    }

    public Base(String s) {
        System.out.print("Base: " + s);
    }
}

class Derived extends Base {
    public Derived(String s) {
       super(); // Stmt-1
       super (s); // Stmt-2
        System.out.print("Derived ");
    }
}

class Test {
    public static void main(String[] args) {
        Base base = new Derived("Hello ");
    }
}

 */

//Que3

/*abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class ExtraQues extends Car {
    {
        System.out.print("4");
    }

    public ExtraQues() {
        super("blue");
        System.out.print("5");
    }

    public ExtraQues(String name) {
        super(name);
    }

    public static void main(String[] gears) {
        new extraQues();
    }
}
 */

//The class is loaded first, with the static initialization block called and 1 is outputted first.
// When the BlueCar is created in the main() method,
// the superclass initialization happens first. The instance initialization blocks
// are executed before the constructor, so 32 is outputted next.
// Finally, the class is loaded with the instance initialization blocks again
// being called before the constructor, outputting 45. The result is that 13245 is printed,
// making Option C the correct answer.


// For an integer literal, the JVM matches in the following order: int, long, Integer, int.... In other words,
// it first looks for an int type parameter; then it looks for long type; and so on. Here, since the int type
// parameter is specified with an overloaded method, it matches with int.
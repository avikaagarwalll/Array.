// Java Program to Illustrate Getter and Setter

// Importing input output classes
/*import java.io.*;

// Class 1
// Helper class
class GetSet {

    // Member variable of this class
    private String name;

    // Method 1 - Getter
    public String getName() { return name; }

    // Method 2 - Setter
    public void setName(String N)
    {

        // This keyword refers to current instance itself
        this.name = N;
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of class 1 in main() method
        GetSet obj = new GetSet();

        // Setting the name by calling setter method
        obj.setName("Geeks for Geeks");
        // Getting the name by calling geter method
        System.out.println(obj.getName());
    }
}
*/

// Java Program to Illustrate Getter and Setter

// Importing input output classes
import java.io.*;

class GetSet {

    // Member variable of this class
    private int num;

    // Method 1 - Setter
    public void setNumber(int number)
    {

        // Checking if number is between 1 to 10 exclusive
        if (number < 1 || number > 10) {

            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Method 2 - Getter
    public int getNumber() { return num; }
}

// Class 2
// Main class
/*class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();

        // Calling method 1 inside main() method
        obj.setNumber(5);

        // Printing the number as setted above
        System.out.println(obj.getNumber());
    }
}

 */

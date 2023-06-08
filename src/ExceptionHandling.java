// Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal
// argument exception.

/*public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int a = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }
    }
}*/


/*public class ExceptionHandling {
     public static void main(String[] args) {
        try {
            int i=9/0;
            System.out.println(i);
            return;
        } catch (Exception e) {
            System.out.println("exception caught");
            return;
        }
        System.out.println("task completed");
    }
}

 */
// there is a return in try block so it makes the last line as unreachable code.So compile time error.
//if there is a return statement in try then no code after try- catch will be valid.


/*public class ExceptionHandling{
        public static void main(String[] args) {
            String returnVal = method1();
            System.out.println(returnVal);
        }

        public static String method1() {
            try {
                int i = 9;
                System.out.println(i);
                return "from try";
            } catch (Exception e) {
                System.out.println("exception caught");
                return "from catch";
            } finally {
                System.out.println("finally block executing");
                return "from finally";
            }
        }
    }

 */






    //Even though try has return statement finally block gets a chance to execute
// before try’s return statement and finally has return statement so it returns “from finally” to caller.


//1)	Write a program in Java to display the names and roll numbers of students.
// Initialize respective array variables for 10 students.
// Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program.
/*import java.util.Scanner;
public class ExceptionHandling {
    int[] roll_no = new int[10];
    String[] names = new String[10];
    int n;
    public void takeInputs() throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
       // int n = sc.nextInt();
        try {

            for (int i = 1; i <=10; i++) {
                System.out.println("Enter roll number of student " + (i + 1) + ": ");
                roll_no[i] = sc.nextInt();
                System.out.println("Enter name of student " + (i + 1) + ": ");
                names[i] = sc.next();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you can accomodate only 10 students\n");
        }
        //sc.close();
    }
    public void display() throws ArrayIndexOutOfBoundsException {

            System.out.println("Name\tRoll Number");
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(names[i] + "\t" + roll_no[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        ExceptionHandling obj = new ExceptionHandling();
        obj.takeInputs();
        obj.display();
    }

}


 */

//Write a Java program to enable the user to handle any chance of divide by zero exception.
/*public class ExceptionHandling {
    public void div(int a, int b) throws ArithmeticException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
    }


    public static void main(String[] args) {
        ExceptionHandling a = new ExceptionHandling ();
        a.div(5, 0);
        a.div(5, 2);
    }
}*/

/*public class ExceptionHandling {
    public void mod(String a, String b) throws NonNumericException {
        try {
            System.out.println(Integer.parseInt(a) % Integer.parseInt(b));
        } catch (NumberFormatException e) {
            throw new NonNumericException("It should be Numeric");
        }
    }

    public static void main(String[] args) throws NonNumericException {
        ExceptionHandling c = new ExceptionHandling();
        c.mod(args[0], args[1]);
    }
}
class NonNumericException extends Exception {
    public NonNumericException(String msg) {
        super(msg);
    }
}
*/
//5)	Write a java program to throw an exception  for an employee details.
//•	If an employee name is a number, a name exception must be thrown.
//•	If an employee age is greater than 50, an age exception must be thrown.
//•	Or else an object must be created for the entered employee details
/*public class ExceptionHandling {
    String name;
    int age;

    public static void main(String[] args) {
        ExceptionHandling e = new ExceptionHandling();
        e.name = "sde";
        e.age = 60;
        try {
            Integer.parseInt(e.name);
            throw new NumberFormatException("Name cannot be a number");
        }
        catch (NumberFormatException err) {
            System.out.println(err);
        }
        try {
            if (e.age > 50) {
                throw new Exception("Age should be less than 50");
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}*/


/*import java.util.*;

class Occurrence {
    static int[] Sub(String a1, String b) {
        int arr[] = new int[2];
        int i = a1.indexOf(b);
        int l = a1.lastIndexOf(b);
        arr[0] = i;
        arr[1] = l;
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        System.out.println("Enter the string to be searched");
        String b = sc.nextLine();
        int arr[] = Sub(a, b);
        System.out.println("The first and last occusrences are" + arr[0] + " " + arr[1]);
    }
}*/
/*class MyException extends Exception{
    MyException(){
        super("Non-numeric Operand");
    }
}
public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            throw new MyException();
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}*/
/*import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        // 1 is for north moving in north direction
        // 0 is for moving in south direction
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if( a!=b) {
            try {
                c = a / b;
                c= b / a;
            } catch (ArithmeticException e) {
                System.out.println("Collision will occur");
            }
        }
        else System.out.println("Collision will not occur");
    }
}

*/
/*import java.io.*;
class collision extends Exception
{
     public collision(String s)
   { super(s); }
}
class main
{
    public static void main(String args[])
    {
        String t1=null,t2=null;
        try
        {
            DataInputStream in= new DataInputStream(System.in);
            System.out.println("enter the direction of vehicle1:(left/right):");
            t1=in.readLine();
            System.out.println("enter the direction of vehicle2:(left/right):");
            t2=in.readLine();
            if(!t1.equals(t2))
                throw new collision("truck2 has to go on "+ t1 +" direction");
        }
        catch(collision e)
        {
            System.out.println(e);
            t2=t1;
            System.out.println("the collision has been avoided by redirection truck2");
        }
        catch(Exception e)
        { System.out.println(e); }
        System.out.println("direction of truck1 :"+t1);
        System.out.println("direction of truck2 :"+t2);
    }
}*/

/*class z extends Exception {
    z(int g) {
        System.out.println("its user defined exception");
    } }
public class Main{
    void test() throws z {
        throw new z(86); }
    public static void main(String[] args) throws z {
        Exception u=new Exception();
       Exception .u();
    } }
/*

 */

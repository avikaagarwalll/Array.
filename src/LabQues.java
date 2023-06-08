// que1

//Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.
/*import java.util.Scanner;
public class LabQues {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int a = sc.nextInt();
    if(int a>40 && int a<250){
        System.out.println(a/5);
    }
    else
    
        System.out.println("wrong");
    }
    class Main{
    public static void main (String[] args){
        System.out.println(a);
        
        }
}
*/

//que2

/*class sumOfIntegers {
     {
        int sum = 0;
        for (int i = 45; i < 250; i = i + 5) {
            sum = sum + i;
        }
        //return sum;
    }

    public static void main(String[] args) {
        int sum ;
         sumOfIntegers s = new sumOfIntegers();
       // int result = s.Sum();
        System.out.println("The sum of integers between 40 to 250 that divisibleby 5 is :"+ sum);
    }

}

 */
//OR
/*import java.util.*;
class LabQues{
    public static void main(String []args){
        int sum=0;
        for(int i =41;i<250;i++){
            if(i%5==0){
                System.out.println(i);
                sum =sum+i;
            }
        }
        System.out.println("Sum of all integers greater than 40 but less than 250 is"+sum);
    }
}/*

 */

//qu3
//Write a Java Program to accept 10 numbers in an array and compute the square of each number.
// Print the sum of these numbers

/*
import java.util.*;
class LabQues{
    Scanner sc = new Scanner(System.in);
    {
     int []arr = new int[10];
    int i;
    int sum;
    int sum=0;
    for(i=0;i<10; i++){
        System.out.println("enter of number");
        arr[i]=sc.nextInt();
    }
        sum =sum+i;
    }
    public static void main(String[]){
        LabQues s = new LabQues();
        for(int i=0;i<10;i++){
            sum = sum+array[i]*array[i];
        }
    }

    System.out.println("sum of all number"+sum);
}*/

/*import java.util.Scanner;
class SquareOfNumber {
    Scanner sc = new Scanner(System.in);
    int[] input_array()
    {
        int[] arr= new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the "+(i+1)+" Number");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        SquareOfNumber s= new SquareOfNumber();
        int sum=0;
        int[] array=s.input_array();
        for(int i=0;i<10;i++)
        {
            sum= sum+array[i]*array[i];
        }
        System.out.println("Sum of all number "+sum);
    }
}

 */
//que4
//Write a program to input a number of month(1-12) and print its equivalent name.


//que5
//Write a program to create interface named test.
// In this interface the member function is square. Implement this interface in arithmetic class.
// Create one new class called ToTestInt. In this class use the object of arithmetic class.
/*interface Test{

  public void square(int a);
   // int a,b;
}
class Arithmetic implements Test{
    //int a,b;
    public void square(int b){
        System.out.println("square of number"+b*b);
    }


}
class ToTestInt{

    public static void main(String[] args) {
        Arithmetic f =new Arithmetic();
        //ToTestInt x =new ToTestInt();
        //System.out.println("the square of 49 is"+);
        f.square(2);
    }

}
*/

//que6

//Write a program to create interface A,
// in this interface we have two method meth1 and meth2.
// Implements this interface in another class named MyClass.

/*interface A{
     public void meth1(int x);
     public void meth2(int y);
}
class MyClass implements A{
    public void meth1(int x) {
        System.out.println(x);
    }
        public void meth2(int y){
            System.out.println(y);
        }

    class Main{
        public void main(String[] args) {
            MyClass c = new MyClass();
            //System.out.println("bhh"+meth1);
            c.meth1(7);
            c.meth2(9);
        }
    }
}

 */

//Write a program to create an Interface having two methods division and modules.
// Create a class, which overrides these methods.

/*interface Hola {
    public void division(int x, int y);

    public void modules(int x, int y);
}
class Avika implements Hola{


    public void division(int x, int y){
        System.out.println(x/y);
    }
    public void modules(int x,int y){
        System.out.println(x%y);
    }
}
class main {
    public static void main(String[] args) {
        Avika c = new Avika();
        c.division(10,5);
        c .modules(4,2);
        //System.out.println("Division"+);
    }
}

interface course {
    void division(int a);

    void modules(int b);
}


class stud implements course {
    String name;
    int div, mod;

    void name(String n) {
        name = n;
    }

    public void division(int a) {
        div = a;
    }

    public void modules(int b) {
        mod = b;
    }

    void disp() {
        System.out.println("Name :" + name);
        System.out.println("Division :" + div);
        System.out.println("Modules :" + mod);
    }
}

class class_main {
    public static void main(String args[]) {
        stud s = new stud();
        s.name("aviya");
        s.division(78);
        s.modules(56);
        s.disp();
    }
}*/

//INHERITANCE

//Write a class Worker and derive classes DailyWorker and SalariedWorker from it.
// Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker.
// A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for
// 40 hours a week no matter what the actual hours are.
// Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism
// to write this program


class Worker{
    String name;
    int salary;
}
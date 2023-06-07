//Write a Java program to find out the day of the week given the
// number [1 for Monday, 2 for Tuesday … and so on!]

/*import java.util.Scanner;
public class AviIfElse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.println("Enter a number");
        switch(a){
            case 1:
                 System.out.println("Monday");
                 break;
            case 2:
                     System.out.println("tue");
                     break;
            case 3:
                     System.out.println("Wed");
                     break;
            case 4:
                      System.out.println("Thurs");
                      break;
            case 5:
                      System.out.println("Fri");
                      break;
            case 6:
                      System.out.println("Sat");
                      break;
            case 7:
                      System.out.println("Sun");
                      break;

            }

            }
        }

 */



//question2
//Write a Java program to find whether a year entered by the user is a leap year or not.
/*import java.util.Scanner;
public class AviIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        //System.out.println("Enter a year"+a);
        if(a % 4==0  ){
            System.out.println("yes its a leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }


 */



//Ques3
//Write a program to find out the type of website from the URL:
//
//.com – commercial website
//.org – organization website
//.in – Indian website
/*import java.util.Scanner;
public class AviIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } else if (website.enEdsWith(".in")) {
            System.out.println("This is an Indian website");
        }

 */
/*import java.util.Scanner;
public class AviIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("bjj");
        if (n % 2 == 0) {
            System.out.println("EVEN NO");
        } else {
            System.out.println("odd NO");

        }
    }

}
*/

//Sum of first n natural number
import java.sql.SQLOutput;
import java.util.Scanner;
class AviIfElse{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println(+sum);
        //return n;
    }
}





//Java program to print all Odd numbers between 1 to N
/*import java.util.Scanner;
class AviIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i =i+2) {
            System.out.println(i);
        }
        //System.out.println(n);
    }
}

 */

//Java program to Calculate Sum of Odd or Even number

/*import java.util.Scanner;
class AviIfElse{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n%2==0){
           for (int i = 0; i<= n; i++){
                sum = sum + i;
               //System.out.println("even");
        }
            System.out.println("even" +sum);
        }
        else{
            for (int i = 1; i<= n; i++){
                sum = sum + i;
                //System.out.println("odd");
            }
            System.out.println("odd" +sum);
        }
       // System.out.println(+sum);
        //return n

    }
}




//Java program to calculate power of a Number
/*import java.util.Scanner;
import java.lang.Math;
class AviIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.pow(a, b));
    }
}

 */
/*
Java program to find Factorial of a Number
import java.util.Scanner;
import java.lang.Math;
class AviIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int a= n / 10;


 */



//Java program to print array elements using Arrays class methods

//import java.util.Scanner;




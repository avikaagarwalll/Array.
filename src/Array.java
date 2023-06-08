//Java program to print array elements using Arrays class methods


/*import java.util.Arrays;

class A{
    public static void main(String[] args) {
        String arr[]= {"Aviu","Shivam","ns"};
        System.out.println("toString()"  + Arrays.toString(arr));
        System.out.println("asList()"  + Arrays.asList(arr));
        int array[][]={{10,20},{40,50}};
        System.out.println("deeptoString()"  + Arrays.deepToString(array));
    }

    }

 */

//Java program to print array elements in reverse order
/*import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println("a[i]" +i);
        }
        for (int i = a.length - 1; i <=0; i--) {
            System.out.println("a[i]"  +i);


        }

    }
}

 */

//5=5*4*3**2*1=120
/*import java.util.Scanner;
class Array{
    public static void main(String args[]){
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //int fact;
            fact = fact*i;
        }
        System.out.println("factorial" +fact);
    }
}

 */
//Java program to count Digits in a Number
//6788-4
/*import java.util.Scanner;
class Array{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
          n=  n/10;
          count++;
        }

        System.out.println( "no.of digits" +count);

    }
}

 */
//Java program to check Voting eligibility
/*import java.util.Scanner;
class Array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

       // int age = 1;
        if (age > 18) {
            System.out.println("eligible" );
        }
        else {
            System.out.println("not eligible");
        }
    }
}

 */
/*import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]a = new int [n];



        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

 */
//Java program to input month number and print number of Days
/*import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();



        switch (month) {

            case 1:

                System.out.println("31");

                break;

            case 2:

                System.out.println("28");

                break;

            case 3:

                System.out.println("March");

                break;

            case 4:

                System.out.println("April");

                break;

            case 5:

                System.out.println("May");

                break;

            case 6:

                System.out.println("30");

                break;
            case 7:

                System.out.println("31");

                break;

            case 8:

                System.out.println("28");

                break;

            case 9:

                System.out.println("March");

                break;

            case 10:

                System.out.println("April");

                break;

            case 11:

                System.out.println("May");

                break;

            case 12:

                System.out.println("30");

                break;

            default: System.out.println("wrong input");

        }

    }

}*/
/*import java.util.*;

public class Array{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]a = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

 */
/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); // to store value in array
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " "); // to print that value which store in array
        }
        System.out.println("Array Length" + a.length);
    }
}

 */
// Java program to print array elements in reverse order



//Java program to arrange array elements in ascending order
//98076---06789
/*import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[4];
        System.out.println("enter any number");
        for(int i=0;i<n;i++)

    }
}

 */
//Java program to calculate area of Triangle
/*import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double area = sc. nextDouble();
        int length =  sc. nextInt();
        int height = sc. nextInt();

         int area =(height*length)/2;
        System.out.println("Area of triangle"+area);
    }
}

 */


//Java program to print Multiplication Table
/*import java.util.Scanner;
public class Array{
    static int j;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        for (int i =1; i<=10;i++){
            System.out.println(n +"*"+i +"="+ n*i);
        }
        }
    }

 */
//Java program to Swap Two Numbers
/*import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swap" +a+ " "+b);
        int c;
        c= a;
        a= b;
        b=c;
        System.out.println("after swap"+a+" "+b);
    }
}

 */

//Java program to check Number is Palindrome or Not
//121--->121
/*import java.util.Scanner;
 class Array {
    static int c;
    static int s=0;
    static int r;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println("enter no."+num);
        c=num;
        while(num>0){
            r=num%10; // (121%10=1)
            s=(s*10)+r;  // (0*10)+ 1=1
            num=num/10;   // 121/10=12
        }
        if (c == s) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}

 */
//Java program to copy all elements of one array to another
/*import java.util.Scanner;
class Array {

    public static void main(String[] args) {

        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}

 */
//bubble sort
public class Array {
    public static void main(String[] args) {
        //    int a[]=new int[5];
        int a[] = {7, 6, 3, 4, 1};
        //int i=3;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

                System.out.println(a[5]);

            }
        }
    }
}
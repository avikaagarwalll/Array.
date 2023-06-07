/*class s07_02 {
    public static void main(String arg[]) throws Exception {
        data d1 = new data();
        data d2 = new data();
        data d3 = new data();
        data d4 = new data();
        data d5 = new data();
        data d6 = new data();
        data d7 = new data();
        data d8 = new data();
        data d9 = new data();
        data d10 = new data();
        System.out.println(d10.count);
    }
}

class item {
    static int count = 0;
}

class data extends item implements Runnable {
    item d = this;
    Thread t;

    data() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        d = syn.increment(d);
    }
}

class syn {
    synchronized static item increment(item i) {
        i.count++;
        return (i);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i += 2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 11; i += 2) {
            System.out.println(i);
        }
    }
}

 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1 is for north moving in north direction
        // 0 is for moving in south direction
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        if( a!=b) {
            try {
                temp = a / b;
                temp = b / a;
            } catch (ArithmeticException e) {
                System.out.println("Collision will occur");
            }
        }
        else System.out.println("Collision will not occur");
    }
}*/
/*class Main extends Thread {
    public void run() {
        System.out.println("Run method executed by child Thread");
    }

    public static void main(String[] args) {
        Test t = new Test();
       // t.start();
        System.out.println("Main method executed by main thread");
    }
}

class Geeks {
    public static void m1() {
        System.out.println("Hello Visitors");
    }
}

 */

// Here we can extends any other class
/*class Test extends Geeks implements Runnable {
    public void run() {
        System.out.println("Run method executed by child Thread");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}
/*public class Main {

    public static void main(String args[]) {

        {

            double a = 15;

            int b = 25;

            a = a % 5;

            b = b % 10;

            System.out.println(a + " " + b);

        }

    }
}


 */
/*class average {
    public static void main(String args[])
    {
        double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result;
        result = 0;
        for (int i = 0; i < 6; ++i)
            result = result + num[i];
        System.out.print(result/6);
    }
}


 */
/*class box
{
    int width;
    int height;
    int length;
}
class mainclass
{
    public static void main(String args[])
    {
        box obj = new box();
        obj.width = 10;
        obj.height = 2;
        obj.length = 10;
        int y = obj.width * obj.height * obj.length;
        System.out.print(y);
    }
}

 */
/*class mainclass {
    public static void main(String args[])
    {
        char a = 'A';
        a++;
        System.out.print((int)a);
    }
}

 */
/*class main_class
{
    public static void main(String args[])
    {
        int x = 9;
        if (x == 9)
        {
            int x = 8;
            System.out.println(x);
        }
    }
}

 */
/*class Test {

    public static void main(String args[]) {

        int arr[2];

        System.out.println(arr[0]);

        System.out.println(arr[1]);

    }
}

 */
/*package javaapplication3;

class static_out

{

    static int x;

    static int y;

    void add(int x, int y)

    {

        this.x = x + y;

        this.y = this.x + y;

    }

}

public class Main

{

    public static void main(String args[])

    {

        static_out obj1 = new static_out();

        static_out obj2 = new static_out();

        int x = 2;

        obj1.add(x, x + 1);

        obj2.add(5, x);

        System.out.println(obj1.x + " " + obj2.y);

    }

}

 */
/*public class Main

{

    public static void main(String args[])

    {

        String obj = "hello";

        String obj1 = "world";

        String obj2 = "hello";

        System.out.println(obj.equals(obj1) + " " + obj.equals(obj2));

    }

}

 */
/*class box
{
    int width;
    int height;
    int length;
}
class mainclass
{
    public static void main(String args[])
    {
        box obj1 = new box();
        box obj2 = new box();
        obj1.height = 1;
        obj1.length = 2;
        obj1.width = 1;
        obj2 = obj1;
        System.out.println(obj2.height);
    }
}

 */
/*public class Main

{

    static boolean b1, b2;

    public static void main(String [] args)

    {

        int x = 0;

        if ( !b1 ) /* Line 7 */

       /* {

            if ( !b2 ) /* Line 9 */

/*class Adder{

    public static int a,b,c;

    int add(int a,int b){return this.a=a+b;}

    int add(int a,int b,int c){return this.a=this.a+b+c;}

}

class TestOverloading1{

    public static void main(String[] args){

        Adder ob=new Adder();

        System.out.println(ob.add(12,11));

        System.out.println(ob.add(11,13,11));

    }}


 */

/*public class Main

{

    public static void main(String args[])

    {

        String obj = "JAVA is a language";

        System.out.println(obj.length());

    }

}

 */
/*class Test {

    public static void main(String args[]) {

        int arr[] = new int[2];

        System.out.println(arr[0]);

        System.out.println(arr[1]);

    }

}

 */
//thread using wait and notify functions.
/*class Q
{
    int num;
    boolean valueSet = false;

    public synchronized void put(int num)
    {
        while(valueSet)
        {
            try { wait();} catch(Exception e){}
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet= true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueSet)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Get : " + num);
        valueSet=false;
        notify();
    }
}

class Producer implements Runnable
{
    Q q;

    public Producer(Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    public void run()
    {
        int i=0;
        while(true)
        {
            q.put(i++);
            try{ Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

class Consumer implements Runnable
{
    Q q;

    public Consumer (Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
            try{ Thread.sleep(1000); } catch (Exception e){}
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}


 */

// Java program to check whether two strings
// are anagrams of each other
/*import java.io.*;
/*import java.util.Arrays;
import java.util.Collections;
class Main
{
    Function to check whether two strings
    are anagram of each other
    static boolean areAnagram(char[] str1,
                              char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not
        // same, then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    // Driver Code
    public static void main(String args[])
    {
        char str1[] = {'r', 'e', 's', 'c','u','e'};
        char str2[] = {'s', 'e', 'c', 'u','r','e'};

        // Function Call
        if (areAnagram(str1, str2))
            System.out.println(
                    "The two strings are" +
                            " anagram of each other");
        else
            System.out.println(
                    "The two strings are not" +
                            " anagram of each other");
    }
}


 */
//package com.company;

/*import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c[] = str.toCharArray();
        sumOfDigitInString(c);
    }

    private static void sumOfDigitInString(char[] c) {
        int i = 0,sum =0;
        int len = c.length;
        while(i<len){
            if((c[i] >= '0') && (c[i]) <='9'){
                sum = (sum + c[i] - '0');
            }
            i++;
        }
        System.out.println(sum);
    }
}

 */
/*public class Main{
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4,7));
    }
}


 */
// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

// Main class
/*public class Main {

    // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Input string
        String str = "geeks";

        //Convert the string to lowercase
        str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }
}

 */
/*public class Main {
    public static void main(String args[]){
        String s1= "Advanced";
        String s2= s1+ "Programming";
        s1 ="Java"+"Language";
        s2.concat(s1);
        System.out.println(s1);
        System.out.println(s2);}}

 */
/*public class Main
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());       //Output : main

        t.setName("My_Main_Thread");

        System.out.println(t.getName());      //Output : My_Main_Thread
    }
}


 */
// Java program for the above approach

/*public class Main{

    // Starting counter
    int counter = 1;

    static int N;

    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is even then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {

                // If count is odd then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(
                        counter + " ");

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given Number N
        N = 10;

        // Create an object of class
        GFG mt = new GFG();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}

 */

/*class Runnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i += 2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 11; i += 2) {
            System.out.println(i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

 */
/*class Main{
public static void main(String arg[]) throws Exception {
        data d1 = new data();
        data d2 = new data();
        data d3 = new data();
        data d4 = new data();
        data d5 = new data();
        data d6 = new data();
        data d7 = new data();
        data d8 = new data();
        data d9 = new data();
        data d10 = new data();
        System.out.println(d10.count);
        }
        }

class item {
    static int count = 0;
}

class data extends item implements Runnable {
    item d = this;
    Thread t;

    data() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        d = syn.increment(d);
    }
}

class syn {
    synchronized static item increment(item i) {
        i.count++;
        return (i);
    }
}

 */
/*import java.io.*;

public class Main {


    static int a[] = new int[26];
    static char c[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    //static char c[] = new char[26];
    static String str1 = "", s = "";

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 26; i++) {
            a[i] = i;
        }
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("ENTER PLAINTEXT: ");
        s = br.readLine();
        System.out.println("ENTER KEY VALUE: ");
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < s.length(); i++) {
            int j;
            if (s.charAt(i) == ' ') {
                i++;
                str1 = str1.concat(" ");
            }

            for (j = 0; j < 26; j++) {
                if (s.charAt(i) == c[j]) {
                    break;
                }
            }
            j = (a[j] + k) % 26;
            str1 = str1.concat(c[j] + "");
        }
        System.out.println("AFTER ENCRYPTION: ");
        System.out.println(str1);
        s = "";
        for (int i = 0; i < str1.length(); i++) {
            int j;
            if (str1.charAt(i) == ' ') {
                i++;
                s = s.concat(" ");
            }
            for (j = 0; j < 26; j++) {
                if (str1.charAt(i) == c[j]) {
                    break;
                }
            }
            j = (a[j] - k) % 26;
            if (j < 0) {
                j = 26 + j;
            }
            s = s.concat(c[j] + "");
        }
        System.out.println("AFTER DECRYPTION: ");
        System.out.println(s);

    }

}

 */
/*import java.util.Scanner;

// create class CaesarCipherExample for encryption and decryption
public class Main
{
    // ALPHABET string denotes alphabet from a-z
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    // create encryptData() method for encrypting user input string with given shift key
    public static String encryptData(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
       inputStr = inputStr.toLowerCase();

        // encryptStr to store encrypted data
        String encryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {
            // get position of each character of inputStr in ALPHABET
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // get encrypted char for each char of inputStr
            int encryptPos = (shiftKey + pos) % 26;
            char encryptChar = ALPHABET.charAt(encryptPos);

            // add encrypted char to encrypted string
            //INFORMATION
            encryptStr += encryptChar;
        }

        // return encrypted string
        return encryptStr;

    }

    // create decryptData() method for decrypting user input string with given shift key
    public static String decryptData(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // decryptStr to store decrypted data
        String decryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < inputStr.length(); i++)
        {

            // get position of each character of inputStr in ALPHABET
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // get decrypted char for each char of inputStr
            int decryptPos = (pos - shiftKey) % 26;

            // if decryptPos is negative
            if (decryptPos < 0){
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);

            // add decrypted char to decrypted string
            decryptStr += decryptChar;
        }
        // return decrypted string
        return decryptStr;
    }

    // main() method start
    public static void main(String[] args)
    {
        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        // take input from the user
        System.out.println("Enter a string for encryption using Caesar Cipher: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.valueOf(sc.nextLine());

        System.out.println("Encrypted Data ===> "+encryptData(inputStr, shiftKey));
        System.out.println("Decrypted Data ===> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));

        // close Scanner class object
        sc.close();
    }
}

 */
/*import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {

                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if (x>=-32768 && x<=32767)System.out.println("* short");
                if (x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if (x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

 */
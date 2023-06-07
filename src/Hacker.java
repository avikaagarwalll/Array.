
/*import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers () {
        System.out.println( "Each team has 11 players in " + getName() );
    }

}

public class Hacker{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}*/

import java.util.*;
//import java.io.*;

/*class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}

	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
        //super.define_me();
		String temp=super.define_me(); //Fix this line

		System.out.println("My ancestor is a cycle who is "+ temp );
	}

}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}

 */

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hacker {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a =sc.nextInt();
         int x = 0;
         int y = 0;

        try{
            int c =x /y;
            System.out.println("result is"+a);

        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}*/
/*import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Hacker{
    public static void main(String[] args) {

        try{
            Scanner s=new Scanner(System.in);
            int x = s.nextInt();
            int y = s.nextInt();

            System.out.println( x/ y);

        }
        catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

 */
/*import java.util.Scanner;
import java.lang.Math;
class MyCalculator {
    long power(int n , int p){
        return (long) Math.pow(n,p);
    }





        if(n>0||p>0) {
        }
            if(n=0 & p==0){
            System.out.println("n and p should not be zero");
            }

            }
            catch (Exception e);{
            System.out.println("n and p should not be negative");
    }
            catch(Exception E){
            System.out.println("n and p should not be zero");
            }



            }


            }
}
public class Hacker {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

 */
/*import java.util.Scanner;

//import static sun.security.util.Debug.args;

public class Hacker {

    public static String getSmallestAndLargest(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;

        for (int i = 1; i <= s.length() - k; i++) { //This line
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);

            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }


        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            s = scan.next();
            k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }
}

 */
/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
/*
    public static void staircase(int n) {
        //Scanner sc =new Scanner(System.in);
        // n= sc.nextInt();
        for(int i=0 ; i<n;i++){
            for(int j=0 ; j<=i;j++){
                System.out.println("#");
            }

        }


    }

}

public class Hacker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
*/
        /*
        import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

 /*   public static String findDay(int month, int day, int year) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

    }

}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/

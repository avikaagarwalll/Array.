
//ParseInt Method of Integer class
/*public class Stringsavi {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

    }
}*/



/*public class Stringsavi{
    public static void main(String[] args) {
        String s="200";
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator
    }
}

 */



//ToString Method of String class

/*public class Stringsavi {
    public static void main(String args[]) {
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());


    }
}
*/



//Reverse a String (using StringBuilder class)

/*import java.util.*;
public class Stringsavi {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;    //10-0-1

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
*/

/*import java.util.*;

public class Stringsavi {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        sb.append(" Stark");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}


//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
/*import java.util.Scanner;
public class Stringsavi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String array ="[1,2,3]";
        String array1 ="[7,0,3]";
        String a =sc.next();
        System.out.println(array+array1);
    }

}

 */

/*import java.util.*;

public class Stringsavi {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);
    }
}

 */


//Input a string from the user. Create a new string called ‘result’ in which you will replace
//the letter ‘e’ in the original string with letter ‘i’.
//Example :
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”


/*import java.util.*;

/*public class Stringsavi {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        String result = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}

 */

/*import java.util.*;

/*public class Stringsavi {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

    }
}*/
public class Stringsavi{
    public static void main(String[] args) {
        String s="abc";
        String z="def";
        System.out.println(s+z);//200100 because + is string concatenation operator
       // System.out.println(i+100);//300 because + is binary plus operator
    }
}





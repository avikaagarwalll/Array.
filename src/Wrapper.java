
//Write a Java code that converts int to Integer, converts Integer to String,
// converts String to int, converts int to String, converts String to Integer converts Integer to int.

/*public class Wrapper {
    public static void main(String[] args) throws NumberFormatException{
        int a = 23;
        Integer x = a;
        String str = String.valueOf(x);
        String b = "abc";
        int c = Integer.parseInt(b);
        System.out.println(c);
        int e = 55;
        String f = String.valueOf(e);
        String g = "Sahil";
        Integer h = Integer.valueOf(g);

        Integer i = 32;
        int j = i;



    }
}
*/

/*public class Wrapper{
    public static void main(String[] args){
        int a = 10;
        System.out.println("a = "+a);
        Integer i = a; // autoboxing
        System.out.println("i = "+i);
    }
}
*/
/*public class SimpleTesting{
    public static void main(String[] args){
        int a = 10;
        System.out.println("a = "+a);
        Integer i = a; // autoboxing
        System.out.println("i = "+i);
    }
}*/


// using constructor
/*public class SimpleTesting{
    public static void main(String[] args){
        int a = 10;
        System.out.println("a = "+a);
        Integer i = new Integer(a);
        System.out.println("i = "+i);
    }
}
*/

//This is another that we can use to convert an int to an Integer in Java.
// Here, we used valueOf() method of the Integer class.
// It is a static method that takes an int primitive argument and returns an Integer object.
// So, we can use this method


/*public class SimpleTesting{
    public static void main(String[] args){
        int a = 10;
        System.out.println("a = "+a);
        Integer i = Integer.valueOf(a);
        System.out.println("i = "+i);
    }
}*/
/*import java.util.Scanner;
public class Wrapper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer str = new StringBuffer(s);
        for(int i = 0 ; i<s.length(); i++ ){
            int x = str.charAt(i);
            if(x>=97){
                x = x- 32;
            }
            char a = (char)x;
            str.setCharAt(i,a);
        }
        System.out.println(str);


    }
}*/

/*public class Wrapper {
    public static void main(String[] args) {
        float a = 3.4f;
        Float b = a;

        //Float c = 3.54f;
        String d = String.valueOf(c);

        String e = "sahil";
        float f = Float.parseFloat(e);

        float g = 3.43f;
        String h = String.valueOf(g);

        String i = "sahil";
        Float j = Float.parseFloat(i);

        Float k = 3.35f;
        float l = k;



    }
}
*/
//Integer.parseInt()
//String.valueOf()

public class Wrapper {
    public static void main(String[] args)
    {
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println("int to Integer value:"+j);
        Integer a2 = 100;
        String a3 = Integer.toString(a2);
        System.out.println(a3);
        String str2 = "1000";
        Integer j2= Integer.parseInt(str2);
        System.out.println("String to int value:"+j2);
        int j3 = 100;
        String s = String.valueOf(j3);
        System.out.println("int to String:"+j3);
        String str = "100";
        Integer obj2 = Integer.valueOf(str);
        System.out.println("String to Integer:" +obj2);
        Integer a1 = 3;
        int i1 = a1.intValue();
        int j1 = a1;
        System.out.println(j1);
    }
}

//Create a class circle and use inheritance to create another class cylinder from it

import java.sql.SQLOutput;

/*class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
       this.radius = r;
    }

    public double area(){
       return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class InheritanceAvi {
    public static void main(String[] args) {
        // Problem 1
         //Circle objC = new Circle(12);
       Cylinder1 obj = new Cylinder1(12, 4);
        // System.out.println("volume of cylinder"+objC);
    }
}
*/

//ques2
//Create a class rectangle and use inheritance to create another class cuboid,
// try to keep it as close to the real-world scenario as possible

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        System.out.println("life");
    }
    Rectangle(int length,int breadth){
        System.out.println("zindagi");
    }
    double area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int length ,int breadth,int height ){
        super( length,breadth);
        System.out.println("hiii");
    }
    double area(){
        return length*breadth*height;
    }
}
public class InheritanceAvi{
    public static void main(String[] args) {
        Cuboid c = new Cuboid(4,5,6);

    }

}

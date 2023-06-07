/*public class PreviousYear  extends Thread{
    public void run(){
        System.out.println("thread is running..."); }
    public static void main(String args[]){
        PreviousYear t1=new PreviousYear();
        t1.start();
        t1.start();
        t1.start();

        t1.start(); } }

 */

import java.util.*;
public class PreviousYear{
    public static void main(String args[]){
        TreeSet<String> al=new TreeSet<String>();
        al.add("Programming");
        al.add("Object");
        al.add("Oriented");
        al.add("Object");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); } } }

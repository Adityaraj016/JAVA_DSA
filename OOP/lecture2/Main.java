package OOP.lecture2;

import OOP.lacture1.lecture1;
import OOP.lecture3.box;

import java.util.ArrayList;

import static OOP.lecture2.Main2.aVoid;

public class Main {
    public static void main(String[] args) {
        lecture1 lt=new lecture1();
        lt.roll=10;
        System.out.println(lt.roll);

        Main2 m2=new Main2();
        m2.name="Aditya";
        m2.age=10;
        System.out.println(m2.name);
        System.out.println(Main2.count);
        Main2.count=10;
        System.out.println(Main2.count);
        System.out.println(m2.count);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.removeLast();
        System.out.println(list);

        //m2 se acces nahi hua,jo default value the wo print hua
//        System.out.println();
//        m2.aVoid();



        //box ko public banana hoga and uske sare properties ko bhi like l,h,b
//        box b1=new box();
//        System.out.println("Length:"+b1.l+"\t"+"Breadth:"+b1.b+"\t"+"Height:"+b1.h);
    }
}

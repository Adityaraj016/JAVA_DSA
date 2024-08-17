package OOP.enums;

interface a{
    void display();
}

//enum cannot extend any classs
class b{
    void hello(){
        System.out.println("Hello bro");
    }
}

public class Main {
    //enum can implement interface
    enum Week  implements a{
        Monday,Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday;


        //agar sirf ek hi object call karoge to sara automaticall call hopa in main
        Week() {
            System.out.println(this);
        }
        void adi(){
            System.out.println("I am aditya");
        }

        @Override
        public void display() {
            System.out.println(this);
        }
    }
/*
Monday,tuesday etc are contants,
enums constant is public ,static ,final
//sice it is final,you cannot create child enums
//type is Week
 */

    public static void main(String[] args) {
//        constuctor sare ke liye run karega,instead of this ki hamne bas Friday ki object banayi
        Week day=Week.Friday;

        day.display();
        day.adi();

        System.out.println(Week.valueOf("Monday"));
//        for(Week week:Week.values()){
//            System.out.println(week);
//        }
//
//        Week day1=Week.Tuesday;
//        System.out.println(day1.ordinal());
    }
}

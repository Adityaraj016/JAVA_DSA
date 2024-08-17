package OOP.lecture3;
//this can be used by any class in this package without importing
//for other classes in other package tom use we have to make it public and then import
public class box {
    //we made public only to use in other package ,in this package to use no need to make public
    public int b,h;
    private int l;
    public box(){
        l=4;
        b=6;
        h=9;
    }
    box(int side){
        this.l=side;
        this.b=side;
        this.h=side;
    }
    box(box old){
        this.l=2 * old.l;
        this.b=2 * old.b;
    }

}
class a extends box{
//    public int b;
    a(){
        System.out.println(b);
    }
}
class Main1{
    public static void main(String[] args) {
        box b1=new box();
        //b1.l cannot be accessed here because it is private
        System.out.println("Length:"+b1.b+"\t"+"Breadth:"+b1.b+"\t"+"Height:"+b1.h);

        a a1=new a();

    }
}

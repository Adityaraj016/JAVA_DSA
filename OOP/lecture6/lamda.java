package OOP.lecture6;

interface Operation{
    int operation(int a , int b);
}
public class lamda {
    public static void main(String[] args) {
        Operation sum=((a, b) -> a + b);
        Operation prod=((a, b) -> a * b);

        System.out.println(sum.operation(5,7));
        System.out.println(prod.operation(5,7));

        lamda fun=new lamda();
        int ans=fun.opearate(5,7,sum);
        System.out.println(ans);
        System.out.println(fun.opearate(5,7,prod));
    }

    private int opearate(int a,int b,Operation op){
        return op.operation(5,7);
    }
}

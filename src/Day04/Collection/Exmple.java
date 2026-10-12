package Day04.Collection;

 interface Calculate {
    int calculate(int a , int b);

}
public class Exmple {

    public static void main(String[] args){

        Calculate add = (a, b) -> a+b;

        System.out.println("Addition" + add.calculate(10,30) );


        Calculate sub = (a,b) -> a -b;

        System.out.println("Sub" + sub.calculate(10,30) );

        Calculate div = (a,b) ->  a/b;

        System.out.println("Addition" + add.calculate(60,30) );

    }

}

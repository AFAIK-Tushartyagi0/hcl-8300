package Day07.SpringBootExample;

public class Main {


    public static void main(String[] args){
        Singleton obj1 = Singleton.Instancevar();
        Singleton obj2 = Singleton.Instancevar();

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}

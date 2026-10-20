package Day07.SpringBootExample;

public class Singleton {



    private static Singleton obj;
    private Singleton(){

    }
    public static Singleton Instancevar(){

        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }

}

package Day05.ExceptionHandling;

public class InvalidAgeException extends Throwable{

    public InvalidAgeException(String  ungerAge){
        System.out.println("under Age");
    }


}

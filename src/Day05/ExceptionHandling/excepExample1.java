package Day05.ExceptionHandling;

public class excepExample1 {
    public static void main(String[] args) throws InvalidAgeException {

        int age = 21;

        if(age > 18){
            throw new InvalidAgeException("under age");
        }
    }
}

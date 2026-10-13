package Day05.ExceptionHandling;

public class exceptionHandling1 {
    public static void main(String[] args){
        int a = 10;
        int b = 0;

        int num[] = {1,2,3,4,5};


        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e);

        }

        try{
            for (int i =0;i<=5;i++){
                System.out.println(num[i]);
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }


        finally {
            System.out.println("It will run");
        }
    }
}

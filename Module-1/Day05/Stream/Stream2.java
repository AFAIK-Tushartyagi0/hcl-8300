package Day05.Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args){

        ArrayList<String> num = new ArrayList<>(Arrays.asList("Tushar", "Smita","Murari","Vishal", "Tarun"));

        num.stream().filter(a->a.startsWith("T"))
                .forEach(s -> System.out.println(s));

    }
}

package Day05.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args){

        ArrayList<String> num = new ArrayList<>(Arrays.asList("Tushar", "Smita","Murari","Vishal", "Tarun"));

        num.stream().map(n-> {if(n.equals("Smita")){ return "Miss ".concat(n);}
        return "Mr ".concat(n); })

                .forEach(s -> System.out.println(s));
    }
}
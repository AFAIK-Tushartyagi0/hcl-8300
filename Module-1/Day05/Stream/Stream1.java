package Day05.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args){
        int[] num = {2,3,4,5,6,7,8,9,10,23,34,45,56,77,89};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ;i<num.length;i++){
            list.add(num[i]);
        }

        list.stream().filter(n -> n%2 == 0 )
                .forEach( e-> System.out.println(e) );


      long count =   list.stream().filter(n -> n%2 == 0 )
                .count();

        System.out.println(count);


    }
}

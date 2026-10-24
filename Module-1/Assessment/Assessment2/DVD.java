package Assessment.Assessment2;

public class DVD  extends libraryItem {

    String director ;
    int duration;

    DVD(String title , int id){
        super(id , title , true , 0 );


    }

    double latefee(int dayslate){
        return dayslate *  1.00;
    }

}

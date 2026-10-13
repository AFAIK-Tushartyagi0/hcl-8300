package Assessment.Assessment2;

public class Magazines extends libraryItem{

    String Publisher ;
    int issueNumber ;

    Magazines(String title, int id){
        super(id,title,true,0);

    }

    double latefee(int dayslate){
        return dayslate * 0.50;
    }
}

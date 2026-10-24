package Assessment.Assessment2;

public class Books  extends libraryItem{

    String author;
    int numPages;

    public Books(String Title , int id){
        super(id, title ,true,0);



    }
    double latefee(int dayslate){
        return dayslate * 0.25;
    }
}

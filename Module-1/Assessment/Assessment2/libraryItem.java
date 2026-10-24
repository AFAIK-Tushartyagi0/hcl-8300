package Assessment.Assessment2;

import java.util.stream.Stream;

public abstract class libraryItem {

    private int id;
    private String title ;
    private boolean avalaible ;
    private int year;


     libraryItem(int id, String title, boolean avalaible , int year){
         this.id = id;
         this.avalaible = avalaible;
         this.title = title;
         this.year= year;
     }

    abstract double latefee(int dayslate);


}

interface Borrowable{
    boolean isAvalaible();
    void borrow();
    void giveBack();
}
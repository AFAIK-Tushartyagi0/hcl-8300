package Day04.Collection;



import java.util.ArrayList;
import java.util.Collections;


public class Employee {



    private int Age;
    private String Name;
    private int roll;
    private int marks;

    Employee(int age, String name, int roll, int marks){
        this.Age = age;
        this.Name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public int getRoll() {
        return roll;
    }

    public void setAge(int age) {
        Age = age;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }



    public static void main(String[] args){
        Employee obj1 = new Employee(20, "Tushar", 68,70);
        Employee obj2 = new Employee(19 , "Vishal", 47, 72  );
        Employee obj3 = new Employee(22 , "Tarun", 45, 74  );
        Employee obj4 = new Employee(19 , "Smita", 49, 79  );

        ArrayList<Employee> list = new ArrayList<>();

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        for(Employee num : list){
            System.out.println(num.getName());
        }

        System.out.println("Sorted order");


        Collections.sort(list, new MyComparator());



    }
}

package Day04.Example;

public class Employee {
    private int age;
    private String name;
    private int AppNo;

    Employee(int age , String name , int AppNo){
        this.age = age;
        this.name = name;
        this.AppNo = AppNo;
    }

    void display(){
        System.out.println("age = " + age);

        System.out.println("name = " + name);

        System.out.println("AppNo = " + AppNo);
    }

    void setage(int age){
        this.age =age;
    }

}

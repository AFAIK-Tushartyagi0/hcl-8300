package Day04.Example;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args){

        ArrayList<Employee> list = new ArrayList<>();

        Employee emp =new Employee(12,"Ram",567);

        crud obj = new crud();

        obj.createEmployee(emp);

        System.out.println("Create the employee");



       list.get(0).display();

       list.get(0).setage(25);

        list.get(0).display();


        list.remove(0);

    }
}

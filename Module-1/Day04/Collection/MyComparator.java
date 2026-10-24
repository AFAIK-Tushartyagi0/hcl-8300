package Day04.Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee s1, Employee s2) {
        return s1.getAge() - s2.getAge();
    }
}

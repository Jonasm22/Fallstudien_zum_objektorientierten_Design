package E_InterfaceComparator;

import java.util.Comparator;

public class VglStudentGroesse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroesse() - o2.getGroesse();
    }

}

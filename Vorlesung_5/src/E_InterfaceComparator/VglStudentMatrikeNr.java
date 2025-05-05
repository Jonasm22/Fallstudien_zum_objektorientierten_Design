package E_InterfaceComparator;

import java.util.Comparator;

public class VglStudentMatrikeNr implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMatrikelNr() - o2.getMatrikelNr();
    }
}

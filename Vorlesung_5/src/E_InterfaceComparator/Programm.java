package E_InterfaceComparator;

import java.util.Collections;
import java.util.LinkedList;

public class Programm {

    public static void main(String[] args) {
        LinkedList<Student> studierende = new LinkedList<Student>();

        studierende.add(new Student("Maier", "Hugo", 12345, 167,3));
        studierende.add(new Student("Müller", "Hans", 52355, 170,2));
        studierende.add(new Student("Schmid", "Heinz", 35845, 187,1));
        studierende.add(new Student("Meier", "Heike", 93455, 197,5));
        studierende.add(new Student("Roth", "Sarah", 49565, 175,7));


        System.out.println("Ausgabe, wie angegeben:");
        for(Student x : studierende){
            System.out.println(x);
        }


        System.out.println("Ausgabe, sortiert nach MatrikelNummer: ");
        Collections.sort(studierende, new VglStudentMatrikeNr());
        for(Student x : studierende){
            System.out.println(x);
        }


        System.out.println("Ausgabe, sortiert nach Groesse: ");
        Collections.sort(studierende, new VglStudentGroesse());
        for(Student x : studierende){
            System.out.println(x);
        }
    }


}

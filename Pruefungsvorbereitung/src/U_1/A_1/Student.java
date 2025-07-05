package U_1.A_1;

import java.util.Arrays;

public class Student {

    private String name;
    private String vorname;
    private int matrikel_nr;
    private Studiengang studiengang;


    public Student(String name, String vorname, int matrikel_nr, Studiengang studiengang) {
        this.name = name;
        this.vorname = vorname;
        this.matrikel_nr = matrikel_nr;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getMatrikel_nr() {
        return matrikel_nr;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setMatrikel_nr(int matrikel_nr) {
        this.matrikel_nr = matrikel_nr;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }


    //OPTIONAL
    @Override
    public String toString() {
        return studiengang + ": " +  studiengang.getRegelnstudientzeit() + " Semester";
    }

    public static void main(String[] args) {

        Student[] students = new Student[10];

            students[0] = new Student("Leo", "Vera", 13345, Studiengang.DEM);
            students[1] = new Student("Ana", "Müller", 13346,  Studiengang.WIF);
            students[2] = new Student("Tom", "Schmidt", 13347, Studiengang.BWL );
            students[3] = new Student("Lisa", "Klein", 13348, Studiengang.SYS_E );
            students[4] = new Student("Paul", "Maier", 13349, Studiengang.DSM );
            students[5] = new Student("Nina", "Schwarz", 13350,  Studiengang.DEM);
            students[6] = new Student("Max", "Fischer", 13351, Studiengang.BWL );
            students[7] = new Student("Emma", "Becker", 13352, Studiengang.WIF );
            students[8] = new Student("Tim", "Wolf", 13353,  Studiengang.SYS_E);
            students[9] = new Student("Sophie", "Lang", 13354, Studiengang.DEM );


/*
            for (Student student : students){
                System.out.println(student);
            }
*/

        Arrays.stream(students)
                .forEach(s-> System.out.println(
                        s.getStudiengang()  + ": " + s.getStudiengang().getRegelnstudientzeit() + " Semester"
                ));




    }


}

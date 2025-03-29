package AufzaelungstypenStudenten;

public class Student {
    //Attributen:
    private String Name;
    private String Vorname;
    private String MatrikelNr;
    private String Studiegang;

    //Konstruktor:
    public Student(String name, String vorname, String matrikelNr, String studiegang) {
        this.Name = name;
        this.Vorname = vorname;
        this.MatrikelNr = matrikelNr;
        this.Studiegang = studiegang;
    }

    //String Method
    public String toString() {
        return "Name: " + this.Name + "\nVorname: " + this.Vorname + "\nMatrikelNr: " + this.MatrikelNr + "\nStudiegang: " + this.Studiegang;
    }

    public static void main(String[] args) {

        //Object Student
        Student[] students = new Student[11];
        students[0] = new Student("Laura", "Roth", "72646", "DSM");
        students[1] = new Student("Jonathan", "Mendoza", "925743", "DEM");
        students[2] = new Student("Lucas", "Schmidt", "12345", "WIF");
        students[3] = new Student("Amelie", "Weber", "67890", "BWL");
        students[4] = new Student("Helene", "Fischer", "13579", "DEM");
        //<Generiert>
        students[5] = new Student("Andreas", "Müller", "24680", "Sys.Eng");
        students[6] = new Student("Julia", "Becker", "98765", "WIF");
        students[7] = new Student("Sebastian", "Hoffmann", "54321", "DSM");
        students[8] = new Student("Laura", "Schulz", "09876", "DSM");
        students[9] = new Student("Daniel", "Richter", "65432", "BWL");
        students[10] = new Student("Eva", "Wagner", "10293", "BWL");
        //</Generiert>
        System.out.println(students[3]);
    }
}

package E_InterfaceComparator;

public class Student {
    private String name;
    private String vorName;
    private int matrikelNr;
    private int groesse;
    private int semester;


    public Student(String name, String vorName, int matrikelNr, int groesse, int semester) {
        setName(name);
        setVorName(vorName);
        setGroesse(groesse);
        setMatrikelNr(matrikelNr);
        setSemester(semester);
    }

//getter
    public String getName() {
        return name;
    }

    public String getVorName() {
        return vorName;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getSemester() {
        return semester;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {

        String erg = "Semester:"  + semester;
        erg += " MatrikelNr: "  + matrikelNr;
        erg += " Name: "  + name;
        erg += " Vorname: "  + vorName;
        erg += " Groesse: "  + groesse;

        return erg;

    }

    @Override
    public int hashCode() {
        return vorName.hashCode() + matrikelNr + semester;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student other = (Student)obj;
            return (this.vorName.equals(other.vorName) && this.matrikelNr == other.matrikelNr);
        }
        else{
            return false;
        }
    }
}


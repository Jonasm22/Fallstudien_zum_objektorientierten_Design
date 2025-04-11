public class Student implements ISortierbar {

    private  int matrikelnr;



    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    @Override
    public String groesser(Object object) {
        return "";
        //Hier muss man eine weitere Logic anwenden
    }
}

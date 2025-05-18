public abstract class Person  {
    private String nachname;
    private String vorname;
  //  private String rolle;
    private Role rolle;

    public Person(String nachname, String vorname, Role rolle) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.rolle = rolle;
    }

    public String getNachname()  {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public Role getRolle() {
        return rolle;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setRolle(Role rolle) {
        this.rolle = rolle;
    }


    //Abstract class
    abstract void describe();

     public void printName(){

        // System.out.println("Nachname: " +  nachname + "||" + "Vorname: " + vorname );
         System.out.printf("Nachname: %s, || Vorname: %s || Role %s" , nachname , vorname, rolle);


     }


}


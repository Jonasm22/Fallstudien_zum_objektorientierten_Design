package GaesteListe;

public class PersonalData {

    private String firstName;
    private String email;

    public PersonalData(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString(){
        return "Name= " + firstName +" ||" + " Email= " + email;
    }



}

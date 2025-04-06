package GaesteListe;

import java.util.ArrayList;

public class GaesteListe {

    //ArrayLit to invite Persons
    private ArrayList<PersonalData> invitePerson;

    //Constructor
    public GaesteListe() {
        invitePerson = new ArrayList<>();
    }


    //Method to invite Persons.
    public  void invitePerson(String firstName,  String guestEmail)  {
        if(existPerson(guestEmail)){
            System.out.println("ERROR-- You are trying to add the name : " + "->"+ firstName + "<-" +
                    " with " + "the Email: " + guestEmail +  " --- This email has already received the invitation before");
        } else {
                invitePerson.add(new PersonalData(firstName, guestEmail ));
                System.out.println( "Name: " + firstName + " Email: "+ guestEmail+ " +++ The invitation was sent successfully" );


        }

    }
    //Check if the person with the same email exist
    public boolean existPerson(String email) {

        for (PersonalData personalData : invitePerson) {
            if (personalData.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;

    }



    public static void main(String[] args) {


        GaesteListe event = new GaesteListe();

        event.invitePerson("Maria ", "Maria@hnu.de");
        event.invitePerson("Maria ", "MariaMustermann@hnu.de");  // Same name but the email is different
        event.invitePerson("Sarah ", "Sarah@hnu.de");
        event.invitePerson("Lisa ", "Lisa@hnu.de");
        event.invitePerson("Lucas", "Lucas@hnu.de");
        event.invitePerson("Maximilian ", "Maximilian@hnu.de");
        event.invitePerson("Luigi", "Maximilian@hnu.de"); // Different name but the same email "ERROR"
        event.invitePerson("Carlos", "LUcas@hnu.de"); // Different name with lowercase letters but the same email with "ERROR""

        }





}


import java.lang.invoke.StringConcatFactory;

public class Attendee extends Person{

  private TicketType ticketType;

public Attendee(String nachname , String vorname, TicketType ticketType){
    super(nachname, vorname , Role.Teilnehmer);
    this.ticketType = ticketType;
}


    public TicketType getTicketType() {
        return ticketType;
    }

    @Override
    void describe() {
        System.out.println("Name: " + getVorname()+ " Nachname: " + getNachname() +  " Ticket: "
                +  ticketType +   " " + ticketType.getPreis());
    }
}

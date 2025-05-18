public class Attendee extends Person{

  private TicketType ticketType;
    public Attendee(String nachname, String vorname, Role rolle, TicketType ticketType) {
        super(nachname, vorname, rolle);
        this.ticketType = ticketType;
    }

    @Override
    void describe() {
        System.out.println("Name: " + getVorname() + getNachname() +  "Ticket: " +  ticketType +   " " + ticketType.getPreis());
    }

}

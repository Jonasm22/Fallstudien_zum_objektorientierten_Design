import java.util.Map;

public class Program {
    public static void main(String[] args) {

        /*--1--*/
        //Teilnehmer
        Attendee teilnehmer1 = new Attendee("Roth", "Lisa" ,TicketType.Student );
        Attendee teilnehmer2 = new Attendee("Meyer", "Max",  TicketType.Standard);

        //Speaker

        Speaker vortraege1 = new Speaker("Mustermann", "Lena");
        Speaker vortraege2 = new Speaker("Rodriguez", "Alex");

        /*--2--*/
        Conference conference = new Conference();
        conference.registerUsers(teilnehmer1, teilnehmer2, vortraege1 ,vortraege2);


        /*--3--*/



                Map <Attendee, PaymentService> paymentServiceMap = Map.of(

                teilnehmer1, new Kreditkarte(),
                teilnehmer2, new Paypal()
                );

        for(Map.Entry<Attendee, PaymentService> entry : paymentServiceMap.entrySet()){
            Attendee attendee = entry.getKey();
            PaymentService service = entry.getValue();

            double price = attendee.getTicketType().getPreis();
            System.out.printf("Zahlung für %s %s (%.2f€): ", attendee.getVorname() ,attendee.getNachname(), price);

            if(service.betragAutorisierung(price)){
                //String taxes = service.fuehreZahlungAus(price);
              // System.out.println(System.out.printf("ok, TX=%s%n", taxes));
            } else{
                System.out.println("Abgelehnt");
            }
        }



    }
}

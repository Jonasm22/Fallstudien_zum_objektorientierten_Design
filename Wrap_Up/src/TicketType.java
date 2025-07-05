public enum TicketType{

    Student(50),
    Standard(100),
    VIP(200);

    private final int preis;

    //Constructor
    TicketType(int preis) {this.preis = preis;}

    //Getter
    public int getPreis() {return preis;}
}

public class Session {

    private String  tittle ;
    private SessionLevel schwierigkeitsgrad;
    private Speaker speaker;


    public Session(String tittle, SessionLevel schwierigkeitsgrad, Speaker speaker) {
        this.tittle = tittle;
        this.schwierigkeitsgrad = schwierigkeitsgrad;
        this.speaker = speaker;
    }

    public String getTittle() {
        return tittle;
    }

    public SessionLevel getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setSchwierigkeitsgrad(SessionLevel schwierigkeitsgrad) {
        this.schwierigkeitsgrad = schwierigkeitsgrad;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void print(){

        System.out.printf("%s %s %s %s %n" , schwierigkeitsgrad , tittle , speaker);

    }


}

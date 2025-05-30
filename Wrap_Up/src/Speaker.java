import java.util.ArrayList;
import java.util.List;

public class Speaker extends Person{

    //Liste der gehaltenen Sessions:
    private List<Session> sessions = new ArrayList<>();

    public Speaker(String nachname, String vorname) {
        super(nachname, vorname, Role.Vortragender);
    }
/*
    public Speaker(String nachname, String vorname, Role rolle, List<Session> sessions) {
        super(nachname, vorname, rolle);
        this.sessions = sessions;
    }

 */
    public void addSession(Session mySession){

        sessions.add(mySession);
    }

    public List<Session> getSessions() {
        return sessions;
    }

    @Override
    void describe() {
        System.out.printf("Speaker: %s %s, || Session:%n" , getVorname() , getNachname() , sessions.size());
    }
}

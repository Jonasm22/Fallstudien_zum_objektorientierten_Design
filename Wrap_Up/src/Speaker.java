import java.util.ArrayList;
import java.util.List;

public class Speaker extends Person{

    private List<Session> session = new ArrayList<>();

    public Speaker(String nachname, String vorname, Role rolle, List<Session> session) {
        super(nachname, vorname, rolle);
        this.session = session;
    }

    public void addSession(Session mySession){

        session.add(mySession);
    }

    public List<Session> getSession() {
        return session;
    }

    @Override
    void describe() {
        System.out.println("");
    }
}

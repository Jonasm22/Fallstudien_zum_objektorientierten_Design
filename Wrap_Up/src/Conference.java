import java.util.List;
import java.util.function.Predicate;

public class Conference {

    private final Repository<Person> users = new Repository<>();
    private final Repository<Person> sessions = new Repository<>();


    public void RegisterUser(Person... persons){

    }


    public void addSessions(Session... session){

    }


    public List<Session> filterSessions(Predicate<Session> predicate){
        
    }
}

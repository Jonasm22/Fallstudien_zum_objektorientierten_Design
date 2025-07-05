import java.util.List;
import java.util.function.Predicate;

public class Conference <T> {

  Repository<Person> personRepository = new Repository<>();
  Repository<Session> sessionRepository = new Repository<>();


  /*--A--*/
    public void registerUsers(Person... personen){
        for(Person person : personen){
            personRepository.add(person);
            System.out.printf("Registered: %s %s (%s)%n",
                    person.getVorname(), person.getNachname(),person.getRolle());
        }
  }

    /*--B--*/
  public void addSessions(Session... sessions){
      for(Session session : sessions){
          sessionRepository.add(session);
          System.out.printf("Session: " );
          //session.printSessionInfo();
      }
  }

    /*--C--*/
  public List<Session> filterSessions(Predicate<Session> predicate){

      return sessionRepository.findAll(predicate);
  }

    /*--D--*/
// The following code below was really challenging
  public double totalRevenue(){

       return personRepository.findAll(person -> person instanceof Attendee).stream()
               .mapToDouble(per->((Attendee)per).getTicketType().getPreis())
               .sum();


  }


  public List<Session> getAllSession(){
        return sessionRepository.findAll(s-> true);
  }

}

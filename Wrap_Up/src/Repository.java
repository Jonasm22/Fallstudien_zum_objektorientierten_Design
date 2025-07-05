import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T> {
   private final List<T> items_repository = new ArrayList<>();

    public void add(T item){
        items_repository.add(item);
    }


    public boolean remove(T item){
        return items_repository.remove(item);
    }

  public T get(int index){
       return items_repository.get(index);
  }

  public int size( ){
        return items_repository.size();
  }

// This method was dificult
  public List<T> findAll (Predicate<T> filter){
        return items_repository.stream()
                .filter(filter)
                .collect(Collectors.toList());

    }
}

package GenericInterfaces;

public interface IRepository<T, ID> {

    void save(T entity);
      T findId(ID id);

}

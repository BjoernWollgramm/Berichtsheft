import java.util.List;

public abstract class GenericRepository<T> {
    private DatabaseLayer layer;


    public GenericRepository(){
        layer = new DatabaseLayer();
    }

    public abstract int insert(T item);


    public abstract int update(T item, T itemOld);

    public abstract int delete(T item);

    public abstract List<T> getAll();

    public abstract List<T> getItemsWithId(int id);



}

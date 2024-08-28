package DAO;


import java.util.Set;

public interface DAOInterface<Thing> {

    void create(Thing thing);
    void delete(Thing thing);
    void update(Thing thing);
    Thing find(Thing thing);
    Set<Thing> getAll();
}

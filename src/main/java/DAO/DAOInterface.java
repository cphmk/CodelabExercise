package DAO;

public interface DAOInterface<Thing> {

    void createPerson(Thing thing);
    void deletePerson(Thing thing);
    void updatePerson(Thing thing);
    Thing findPerson(Thing thing);
}

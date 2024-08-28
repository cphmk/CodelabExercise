package DAO;


public interface DAOInterface<Thing> {




    // Person
    void createPerson(Thing thing);
    void deletePerson(Thing thing);
    void updatePerson(Thing thing);
    Thing findPerson(Thing thing);
    void readPerson(Thing thing);
}

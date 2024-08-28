import DAO.PersonDAO;
import entities.Person;

public class Main {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        personDAO.createPerson(Person.builder()
                .name("Joakim")
                .age(42)
                .id(1)
                .build());
    }
}




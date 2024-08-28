import DAO.PersonDAO;
import entities.Person;

public class Main {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        personDAO.create(Person.builder()
                .name("Joakim")
                .age(42)
                .build());

       /* personDAO.delete(Person.builder()
                .id(2)
                .build());

        */
    }
}




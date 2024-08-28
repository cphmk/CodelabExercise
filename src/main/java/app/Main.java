package app;

public class Main {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        Person person = Person.builder()
                .name("Benjamin")
                .age(29)
                .build();
        personDAO.create(person);
    }
}
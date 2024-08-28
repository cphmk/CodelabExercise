package DAO;

import entities.Person;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import persistence.HibernateConfig;

import java.util.Map;

public class PersonDAO implements DAOInterface<Person>{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


        @Override
        public void createPerson(Person person) {
            try (EntityManager em = emf.createEntityManager()) {
                em.getTransaction().begin();
                em.persist(person);
                em.getTransaction().commit();
            }
        }

    @Override
    public void deletePerson(Person person) {

    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public Person findPerson(Person person) {
        return null;
    }

    @Override
    public void readPerson(Person person) {


    }


}

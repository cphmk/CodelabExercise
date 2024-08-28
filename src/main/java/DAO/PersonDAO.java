package DAO;

import entities.Person;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import persistence.HibernateConfig;

import java.util.Map;
import java.util.Set;


public class PersonDAO implements DAOInterface<Person>{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


        @Override
        public void create(Person person) {
            try (EntityManager em = emf.createEntityManager()) {
                em.getTransaction().begin();
                em.persist(person);
                em.getTransaction().commit();
            }
        }

    @Override
    public void delete(Person person) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(person);
            em.getTransaction().commit();
        }
    }

    @Override

    public void update(Person person) {
      
    }

    @Override
    public Person find(Person person) {
        return null;
    }

    @Override

    public Set<Person> getAll() {
        return Set.of();
    }

}

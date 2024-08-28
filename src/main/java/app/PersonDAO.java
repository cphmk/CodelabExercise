package app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class PersonDAO implements IDAO<Person>{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Person person) {
        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
    }

    @Override
    public Person getById(int id) {
        try(EntityManager em = emf.createEntityManager()){
            return em.find(Person.class, id);
        }
    }

    @Override
    public void update(Person person) {
        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        }

    }

    @Override
    public void delete(Person person) {

        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.remove(person);
            em.getTransaction().commit();
        }
    }
}

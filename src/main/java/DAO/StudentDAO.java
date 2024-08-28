package DAO;

import entities.Person;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import persistence.HibernateConfig;

import java.util.Map;
import java.util.Set;

public class StudentDAO implements DAOInterface<Student> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


    @Override
    public void create(Student person) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(Student);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Student person) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(Student);
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(Student person) {

    }

    @Override
    public Person find(Student person) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        return Set.of();
    }


}

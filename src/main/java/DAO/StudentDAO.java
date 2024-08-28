package DAO;

import entities.Person;
import entities.Student;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import persistence.HibernateConfig;

import java.util.Map;
import java.util.Set;

public class StudentDAO implements DAOInterface<Student> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


    @Override
    public void create(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student find(Student student) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        return Set.of();
    }


}

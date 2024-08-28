package DAO;

import entities.Course;
import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import persistence.HibernateConfig;

import java.util.Set;

public class CourseDAO implements DAOInterface<Course> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        }

    }

    @Override
    public Course find(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            return em.find(Course.class, course.getId());
        }
    }

    @Override
    public Set<Course> getAll() {
        return Set.of();
    }
}

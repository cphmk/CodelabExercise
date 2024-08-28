package DAO;

import entities.Course;
import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import persistence.HibernateConfig;

public class CourseDAO implements DAOInterface<Course> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void createPerson(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public void deletePerson(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }

    }

    @Override
    public void updatePerson(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        }

    }

    @Override
    public Course findPerson(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            return em.find(Course.class, course.getId());
        }
    }
}
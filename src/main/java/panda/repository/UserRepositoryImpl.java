package panda.repository;

import panda.domain.entities.User;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    @Inject
    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public User save(User entity) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(entity);
        this.entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public List<User> findAll() {
        return this.entityManager.createQuery("SELECT u FROM users u", User.class).getResultList();
    }

    @Override
    public User findById(String id) {
        return this.entityManager
                .createQuery("SELECT u FROM users u WHERE u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Long size() {
        Long size = this.entityManager.createQuery("SELECT count(u) FROM users u", Long.class).getSingleResult();
        return size;
    }

    @Override
    public User findByUsername(String username) {
        return this.entityManager
                .createQuery("SELECT u FROM users u WHERE u.username = :username", User.class)
                .setParameter("username", username)
                .getSingleResult();
    }
}

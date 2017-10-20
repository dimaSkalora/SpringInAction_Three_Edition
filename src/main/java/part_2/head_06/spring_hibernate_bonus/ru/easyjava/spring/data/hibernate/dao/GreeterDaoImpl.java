package part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.entity.Greeter;

import javax.inject.Inject;


/**
 * JPA based implementation of GreeterDao.
 */
@Repository
public class GreeterDaoImpl implements GreeterDao {
    /**
     * JPA EM factory, provided by Spring.
     */
    @Inject
    private SessionFactory sessionFactory_bonus;

    @Override
    public final void addGreet(final Greeter g) {
        Session s = sessionFactory_bonus.openSession();
        s.getTransaction().begin();
        s.persist(g);
        s.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public final List<Greeter> getGreetings() {
        return sessionFactory_bonus.openSession()
                .createCriteria(Greeter.class)
                .list();
    }
}

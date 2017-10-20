package part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.service;

import org.springframework.stereotype.Service;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.dao.GreeterDao;
import part_2.head_06.spring_hibernate_bonus.ru.easyjava.spring.data.hibernate.entity.Greeter;

import javax.inject.Inject;
import java.util.Iterator;
import java.util.List;

/**
 * Simple greeter implementation.
 */
@Service
public class GreeterServiceImpl implements GreeterService {
    /**
     * Our data layer.
     */
    @Inject
    private GreeterDao dao;

    @Override
    public final String greet() {
        List<Greeter>  greets = dao.getGreetings();
        Iterator<Greeter> it = greets.iterator();
        if (!it.hasNext()) {
            return "No greets";
        }
        Greeter greeter = it.next();
        return greeter.getGreeting() + ", " + greeter.getTarget();
    }
}

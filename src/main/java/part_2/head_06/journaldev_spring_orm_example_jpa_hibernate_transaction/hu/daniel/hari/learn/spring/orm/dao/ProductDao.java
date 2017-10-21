package part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.model.Product;

@Component
public class ProductDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(Product product) {
		em.persist(product);
	}

	public List<Product> findAll() {
		return em.createQuery("SELECT p FROM Product p").getResultList();
	}

}

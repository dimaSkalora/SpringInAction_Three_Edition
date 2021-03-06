package part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.dao.ProductDao;
import part_2.head_06.journaldev_spring_orm_example_jpa_hibernate_transaction.hu.daniel.hari.learn.spring.orm.model.Product;

@Component
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void add(Product product) {
		productDao.persist(product);
	}
	
	@Transactional
	public void addAll(Collection<Product> products) {
		for (Product product : products) {
			productDao.persist(product);
		}
	}

	@Transactional(readOnly = true)
	public List<Product> listAll() {
		return productDao.findAll();

	}

}

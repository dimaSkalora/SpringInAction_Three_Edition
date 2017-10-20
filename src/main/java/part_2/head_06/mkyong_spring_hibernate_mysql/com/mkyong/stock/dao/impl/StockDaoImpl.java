package part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.dao.StockDao;
import part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.model.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao {
	
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
	/*	List list = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		return (Stock)list.get(0);*/
	return null;
	}

}

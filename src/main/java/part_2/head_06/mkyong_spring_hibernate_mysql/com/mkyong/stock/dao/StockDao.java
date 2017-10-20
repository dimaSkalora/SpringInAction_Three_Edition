package part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.dao;

import part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.model.Stock;

public interface StockDao {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}

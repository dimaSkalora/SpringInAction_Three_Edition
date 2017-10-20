package part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.bo.StockBo;
import part_2.head_06.mkyong_spring_hibernate_mysql.com.mkyong.stock.model.Stock;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("Part_2-resources/Head_06/mkyong-spring-hibernate-mysql/SpringHibernateStock.xml");
		System.out.println("hihi");
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");

		System.out.println("hihi");
    	/** insert **/
    	Stock stock = new Stock();
    	stock.setStockCode("7668");
    	stock.setStockName("HAIO");
    	stockBo.save(stock);
    	
    	/** select **/
    	Stock stock2 = stockBo.findByStockCode("7668");
    	System.out.println(stock2);
    	
    	/** update **/
    	stock2.setStockName("HAIO-1");
    	stockBo.update(stock2);
    	
    	/** delete **/
    	stockBo.delete(stock2);
    	
    	System.out.println("Done");
    }
}

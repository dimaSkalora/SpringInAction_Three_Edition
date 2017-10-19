package part_2.head_06.spring_jdbc_bonus;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_06.spring_jdbc_bonus.dao.jdbc.JdbcTemplateDeveloperDaoImpl;
import part_2.head_06.spring_jdbc_bonus.model.Developer;

import java.util.List;

public class JdbcDeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_2-resources/Head_06/Spring-jdbc-bonus/jdbctemplate-developer-config.xml");

        JdbcTemplateDeveloperDaoImpl jdbcTemplateDeveloperDao =
                (JdbcTemplateDeveloperDaoImpl) context.getBean("jdbcTemplateDeveloperDao");

        System.out.println("========Creating new records to DB========");
        jdbcTemplateDeveloperDao.createDeveloper("Proselyte", "Java Developer", 3);
        jdbcTemplateDeveloperDao.createDeveloper("Petr", "C++ Developer", 2);
        jdbcTemplateDeveloperDao.createDeveloper("DesignerAsya", "UI Developer", 1);

        System.out.println("========Developers List========");
        List<Developer> developers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Developer developer : developers) {
            System.out.println(developer);
        }

        System.out.println("========Some changes to DB========");
        jdbcTemplateDeveloperDao.updateDeveloper(33, "DesignerAsya", "UI Developer", 2);
        jdbcTemplateDeveloperDao.removeDeveloper(32);

        System.out.println("========Final Developers List========");
        List<Developer> finalDevelopers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Developer developer : finalDevelopers) {
            System.out.println(developer);
        }
    }
}

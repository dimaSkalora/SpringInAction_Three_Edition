package part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.dao.jdbcTemplate.JdbcTemplateDeveloperDaoImpl;
import part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.dao.jdbcTemplate.JdbcTemplateProjectDaoImpl;
import part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.model.DeveloperProselyte;
import part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.model.ProjectProselyte;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_2-resources/Head_07/proselyte-declarative-transaction/Transaction-JDBC/transaction-declarative-config.xml");
        JdbcTemplateDeveloperDaoImpl developerDao =
                (JdbcTemplateDeveloperDaoImpl) context.getBean("developerJDBCTemplate");
        JdbcTemplateProjectDaoImpl projectDao =
                (JdbcTemplateProjectDaoImpl) context.getBean("projectJDBCTemplate");

        System.out.println("======== Creating project's records ========");
        projectDao.createProject(90, "ProselyteTutorial", "Proselyte.net");
        projectDao.createProject(90, "SkybleLib", "SkybleSoft");

        System.out.println("======== Creating developer's records ========");
        developerDao.createDeveloper("Proselyte", "Java DeveloperProselyte", 3);
        developerDao.createDeveloper("Mike", "C++ DeveloperProselyte", 5);

        System.out.println("======== List of Developers ========");
        List<DeveloperProselyte> developerList = developerDao.listDevelopers();
        for (DeveloperProselyte developer : developerList) {
            System.out.println(developer);
        }

        System.out.println("======== Proselyte DeveloperProselyte's Projects ========");
        List<ProjectProselyte> projects = developerDao.listDevelopersProjects(90);
        for (ProjectProselyte project : projects) {
            System.out.println(project);
        }

    }
}

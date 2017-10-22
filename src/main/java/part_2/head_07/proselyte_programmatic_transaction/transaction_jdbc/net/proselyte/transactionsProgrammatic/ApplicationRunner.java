package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.dao.jdbcTemplate.JdbcTemplateDeveloperDaoImpl;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.dao.jdbcTemplate.JdbcTemplateProjectDaoImpl;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.DeveloperProselyte;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.ProjectProselyte;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Part_2-resources/Head_07/proselyte-programmatic-transaction/Transaction-JDBC/transactions-programmatic-config.xml");
        JdbcTemplateDeveloperDaoImpl developerDao =
                (JdbcTemplateDeveloperDaoImpl) context.getBean("developerJDBCTemplate");
        JdbcTemplateProjectDaoImpl projectDao =
                (JdbcTemplateProjectDaoImpl) context.getBean("projectJDBCTemplate");


        System.out.println("======== Creating developer's records ========");
        developerDao.createDeveloper("Proselyte", "Java Developer", 3);
        developerDao.createDeveloper("Mike", "C++ Developer", 5);

        System.out.println("======== List of Developers ========");
        List<DeveloperProselyte> developerList = developerDao.listDevelopers();
        for (DeveloperProselyte developer : developerList) {
            System.out.println(developer);
        }

        System.out.println("======== Creating project's records ========");
        projectDao.createProject(82, "ProselyteTutorial", "Proselyte.net");
        projectDao.createProject(82, "SkybleLib", "SkybleSoft");

        System.out.println("======== Proselyte Developer's Projects ========");
        List<ProjectProselyte> projects = developerDao.listDevelopersProjects(82);
        for (ProjectProselyte project : projects) {
            System.out.println(project);
        }

    }
}

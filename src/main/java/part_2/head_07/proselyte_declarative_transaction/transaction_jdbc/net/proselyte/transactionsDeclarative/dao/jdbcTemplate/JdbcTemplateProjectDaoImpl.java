package part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.dao.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.dao.ProjectDao;

import javax.sql.DataSource;

public class JdbcTemplateProjectDaoImpl implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createProject(Integer developerId, String projectName, String companyName) {
        String SQL = "INSERT INTO projects_proselyte (DEVELOPERS_proselyte_ID, NAME, COMPANY) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, developerId, projectName, companyName);
        System.out.println("Project record created successfully. Project name: " +
                projectName + ", Company: " + companyName + "\n");
    }
}

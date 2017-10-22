package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.dao;


import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.DeveloperProselyte;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.ProjectProselyte;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {
    public void setDataSource(DataSource dataSource);

    public void createDeveloper(String name, String specialty, Integer experience);

    public List<DeveloperProselyte> listDevelopers();

    public List<ProjectProselyte> listDevelopersProjects(Integer id);
}

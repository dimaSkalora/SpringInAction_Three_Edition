package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.dao;

import javax.sql.DataSource;

public interface ProjectDao {
    public void setDataSource(DataSource dataSource);

    public void createProject(Integer developersId, String projectName, String companyName);
}

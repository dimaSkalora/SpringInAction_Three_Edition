package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.utils;
import org.springframework.jdbc.core.RowMapper;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.ProjectProselyte;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectsMapper implements RowMapper<ProjectProselyte> {
    @Override
    public ProjectProselyte mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProjectProselyte project = new ProjectProselyte();

        project.setDeveloperProselyteId(rs.getInt("DEVELOPERS_proselyte_ID"));
        project.setProjectName(rs.getString("NAME"));
        project.setCompanyName(rs.getString("COMPANY"));

        return project;
    }
}

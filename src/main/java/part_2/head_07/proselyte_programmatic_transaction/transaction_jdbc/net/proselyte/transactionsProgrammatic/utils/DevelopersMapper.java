package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.utils;
import org.springframework.jdbc.core.RowMapper;
import part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model.DeveloperProselyte;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DevelopersMapper implements RowMapper<DeveloperProselyte> {
    @Override
    public DeveloperProselyte mapRow(ResultSet rs, int rowNum) throws SQLException {
        DeveloperProselyte developer = new DeveloperProselyte();

        developer.setId(rs.getInt("id"));
        developer.setName(rs.getString("name"));
        developer.setSpecialty(rs.getString("specialty"));
        developer.setExperience(rs.getInt("experience"));

        return developer;
    }
}

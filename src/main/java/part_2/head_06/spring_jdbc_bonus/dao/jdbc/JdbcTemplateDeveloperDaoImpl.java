package part_2.head_06.spring_jdbc_bonus.dao.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import part_2.head_06.spring_jdbc_bonus.dao.DeveloperDao;
import part_2.head_06.spring_jdbc_bonus.model.Developer;
import part_2.head_06.spring_jdbc_bonus.util.DeveloperMapper;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateDeveloperDaoImpl implements DeveloperDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createDeveloper(String name, String specialty, Integer experience) {
        String SQL = "INSERT INTO DEVELOPERS (name, specialty, experience) VALUES (?,?,?)";

        jdbcTemplate.update(SQL, name, specialty, experience);
        System.out.println("DeveloperProselyte successfully created.\nName: " + name + ";\nSpecilaty: " +
                specialty + ";\nExperience: " + experience + "\n");
    }

    @Override
    public Developer getDeveloperById(Integer id) {
        String SQL = "SELECT * FROM DEVELOPERS WHERE id = ?";
        Developer developer = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new DeveloperMapper());
        return developer;
    }

    @Override
    public List<Developer> listDevelopers() {
        String SQL = "SELECT * FROM DEVELOPERS";
        List<Developer> developers = jdbcTemplate.query(SQL, new DeveloperMapper());
        return developers;
    }

    @Override
    public void removeDeveloper(Integer id) {
        String SQL = "DELETE FROM DEVELOPERS WHERE id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("DeveloperProselyte with id: " + id + " successfully removed");
    }

    @Override
    public void updateDeveloper(Integer id, String name, String specialty, Integer experience) {
        String SQL = "UPDATE DEVELOPERS SET name = ?, specialty = ?, experience = ? WHERE id = ?";
        jdbcTemplate.update(SQL, name, specialty, experience, id);
        System.out.println("DeveloperProselyte with id: " + id + " successfully updated.");
    }
}

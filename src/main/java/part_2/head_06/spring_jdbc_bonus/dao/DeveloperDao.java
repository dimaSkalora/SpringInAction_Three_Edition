package part_2.head_06.spring_jdbc_bonus.dao;

import part_2.head_06.spring_jdbc_bonus.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {
    public void setDataSource(DataSource dataSource);

    public void createDeveloper(String name, String specialty, Integer experience);

    public Developer getDeveloperById(Integer id);

    public List<Developer> listDevelopers();

    public void removeDeveloper(Integer id);

    public void updateDeveloper(Integer id, String name, String specialty, Integer experience);
}

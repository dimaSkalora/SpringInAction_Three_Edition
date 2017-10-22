package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model;

import java.util.List;

public class DeveloperProselyte {
    private Integer id;
    private String name;
    private String specialty;
    private List<ProjectProselyte> projects;
    private Integer experience;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<ProjectProselyte> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectProselyte> projects) {
        this.projects = projects;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer_proselyte:\n" +
                "id: " + id +
                "\nName: " + name +
                "\nSpecialty: " + specialty +
                "\nExperience: " + experience + "\n";
    }
}

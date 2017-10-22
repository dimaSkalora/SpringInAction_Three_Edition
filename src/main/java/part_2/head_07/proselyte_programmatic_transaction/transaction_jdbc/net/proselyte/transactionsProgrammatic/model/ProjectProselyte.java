package part_2.head_07.proselyte_programmatic_transaction.transaction_jdbc.net.proselyte.transactionsProgrammatic.model;

public class ProjectProselyte {
    private Integer DeveloperProselyteId;
    private String projectName;
    private String companyName;

    public Integer getDeveloperProselyteId() {
        return DeveloperProselyteId;
    }

    public void setDeveloperProselyteId(Integer developerProselyteId) {
        this.DeveloperProselyteId = developerProselyteId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ProjectProselyte:" +
                "\nDeveloper's Id: " + DeveloperProselyteId +
                "\nProjectProselyte name: " + projectName +
                "\nCompanyName: " + companyName + "\n";
    }
}

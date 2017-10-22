package part_2.head_07.proselyte_declarative_transaction.transaction_jdbc.net.proselyte.transactionsDeclarative.model;

public class ProjectProselyte {
    private Integer developersId;
    private String projectName;
    private String companyName;

    public Integer getDevelopersId() {
        return developersId;
    }

    public void setDevelopersId(Integer developersId) {
        this.developersId = developersId;
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
                "\nDeveloperProselyte's Id: " + developersId +
                "\nProject name: " + projectName +
                "\nCompanyName: " + companyName + "\n";
    }
}

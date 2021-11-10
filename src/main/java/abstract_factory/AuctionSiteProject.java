package abstract_factory;

import abstract_factory.banking.BankingTeamFactory;
import abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating auction system...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

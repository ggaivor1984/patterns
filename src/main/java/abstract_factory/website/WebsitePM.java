package abstract_factory.website;

import abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website manager manages Website project...");
    }
}

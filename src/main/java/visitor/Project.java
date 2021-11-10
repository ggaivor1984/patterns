package visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }


    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}

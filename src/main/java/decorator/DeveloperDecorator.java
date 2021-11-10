package decorator;

public class DeveloperDecorator implements Developer{

    Developer developer;
    DeveloperDecorator(Developer developer){
        this.developer = developer;
    }
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

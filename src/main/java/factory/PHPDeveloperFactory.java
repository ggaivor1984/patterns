package factory;

public class PHPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }
}

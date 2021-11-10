package abstract_factory.banking;

import abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java developer writes code...");
    }
}

package flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));

        developerList.add(developerFactory.getDeveloperBySpeciality("C++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("C++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("C++"));
        developerList.add(developerFactory.getDeveloperBySpeciality("C++"));

        for(Developer developer:developerList){
            developer.writeCode();
        }

    }
}

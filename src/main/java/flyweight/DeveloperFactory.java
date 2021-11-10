package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    public static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String specialty){
        Developer developer = developers.get(specialty);

        if(developer==null){
            switch (specialty){

                case "java":
                    System.out.println("Hiring Java developer...");
                    developer=new JavaDeveloper();
                break;
                case "C++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                break;
            }
            developers.put(specialty,developer);
        }
        return developer;
    }
}

package factory;

public class Program {
    public static void main(String[] args) {
DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("C");
Developer developer = developerFactory.createDeveloper();
developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality){
      if(speciality.equalsIgnoreCase("Java")){
          return new JavaDeveloperFactory();
      }
      else if(speciality.equalsIgnoreCase("C++")){
          return new CppDeveloperFactory();
      } else if(speciality.equalsIgnoreCase("Java")){
            return new PHPDeveloperFactory();
        } else throw new RuntimeException(speciality + " is unknown speciality");
    }
}

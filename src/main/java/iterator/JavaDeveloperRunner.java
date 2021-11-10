package iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Spring", "Hibernate", "Maven", "SQL", "Lombok"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Grigorii Gaivoronskii", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer " + javaDeveloper.getName() + " has following skills: ");
        while(iterator.hasNext()){

            System.out.print(iterator.next() + " ");
        }
    }
}

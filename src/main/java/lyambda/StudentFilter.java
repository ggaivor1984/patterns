package lyambda;

import java.util.List;

public class StudentFilter {
    public void studentFilter(List<Student> al, Checker checker){
        for (Student st:al){
            if(checker.check(st)){
                System.out.println(st);
            }
        }
    }
}

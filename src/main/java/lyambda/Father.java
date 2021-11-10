package lyambda;

public class Father {
    String a;
    String b;
    String c;

    Father(String c) {
        System.out.println("Мы в родительском контрукторе");
        a = "Привет";
        b = "Как дела?";
        this.c = c;
    }

}

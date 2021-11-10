package adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.update();
        dataBase.insert();
        dataBase.select();
        dataBase.remove();
    }



}

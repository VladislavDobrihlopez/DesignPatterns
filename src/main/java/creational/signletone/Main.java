package creational.signletone;

public class Main {
    public static void main(String[] args) {
        AppDatabase roomDatabase = AppDatabase.getInstance();
        roomDatabase.query("SELECT * FROM some_table_name");
    }
}

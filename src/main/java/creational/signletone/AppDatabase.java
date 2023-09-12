package creational.signletone;

public class AppDatabase {
    private static AppDatabase instance = null;

    private AppDatabase() {}
    public void query(String query) {}

    public static AppDatabase getInstance() {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = new AppDatabase();
                }
                return instance;
            }
        } else {
            return instance;
        }
    }
}

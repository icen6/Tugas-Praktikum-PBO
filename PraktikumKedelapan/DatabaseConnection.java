public class DatabaseConnection {
    private static DatabaseConnection instance = null; 
    private DatabaseConnection() {
        System.out.println("Database connection created.");
    }
    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection(); 
        }
        return  instance;
    }

    public static void main(String[] args) {
        DatabaseConnection Koneksi1 = DatabaseConnection.getInstance();
        DatabaseConnection Koneksi2 = DatabaseConnection.getInstance();
    }
}
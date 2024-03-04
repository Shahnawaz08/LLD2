package Class2.Singleton.EagerLoading;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        System.out.println(databaseConnection);
        System.out.println(databaseConnection1);
        System.out.println("Data base connection is created only once and used by all the clients.");
    }
}

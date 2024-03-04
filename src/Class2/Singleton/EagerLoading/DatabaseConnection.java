package Class2.Singleton.EagerLoading;

public class DatabaseConnection {

    //Eager loading

    private static final DatabaseConnection instance =new DatabaseConnection();

    //Make constructor private
    private DatabaseConnection(){}

    //Below code is singleton pattern but not multi-thread safe
//    public static DatabaseConnection getInstance(){
//        if(instance == null)
//            instance = new DatabaseConnection();
//        return instance;
//    }

    public static DatabaseConnection getInstance(){
        return instance;
    }


}

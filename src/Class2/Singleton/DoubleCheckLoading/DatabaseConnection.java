package Class2.Singleton.DoubleCheckLoading;

public class DatabaseConnection {

    //Eager loading

    private static  DatabaseConnection instance =null;

    //Make constructor private
    private DatabaseConnection(){}

// Double check locking
    public static  DatabaseConnection getInstance(){ //synchronized keyword is used to make the method thread safe
        if(instance == null){
            synchronized (DatabaseConnection.class) {
                if (instance == null) { //double check
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }


}

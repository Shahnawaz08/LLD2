package Class2.Singleton.Synchronized;

public class DatabaseConnection {

    //Eager loading

    private static  DatabaseConnection instance =null;

    //Make constructor private
    private DatabaseConnection(){}

//here performance is not good because of synchronized keyword since every thread have to wait for the lock
    public static synchronized DatabaseConnection getInstance(){ //synchronized keyword is used to make the method thread safe
        if(instance == null){
            instance= new DatabaseConnection();
        }
        return instance;
    }


}

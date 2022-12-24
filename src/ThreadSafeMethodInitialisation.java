public class ThreadSafeMethodInitialisation {

    private static ThreadSafeMethodInitialisation instance;

    private ThreadSafeMethodInitialisation() {}

    public static synchronized ThreadSafeMethodInitialisation getInstance(){
        if(instance == null){
            instance = new ThreadSafeMethodInitialisation();
        }
        return instance;
    }
}

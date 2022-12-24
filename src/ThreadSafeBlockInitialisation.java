public class ThreadSafeBlockInitialisation {

    private static ThreadSafeBlockInitialisation instance;

    private ThreadSafeBlockInitialisation() {}

    public static synchronized ThreadSafeBlockInitialisation getInstance(){
        if(instance == null){
            synchronized (ThreadSafeBlockInitialisation.class) {
                instance = new ThreadSafeBlockInitialisation();
            }
        }
        return instance;
    }
}

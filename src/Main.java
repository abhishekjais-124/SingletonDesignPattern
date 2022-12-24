public class Main {
    public static void main(String[] args) {

        System.out.println(EagerInitialisation.getInstance());
        System.out.println(EagerInitialisation.getInstance());

        System.out.println(LazyInitialisation.getInstance());
        System.out.println(LazyInitialisation.getInstance());

        System.out.println(ThreadSafeMethodInitialisation.getInstance());
        System.out.println(ThreadSafeMethodInitialisation.getInstance());

        System.out.println(ThreadSafeBlockInitialisation.getInstance());
        System.out.println(ThreadSafeBlockInitialisation.getInstance());


    }
}
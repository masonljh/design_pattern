package SingletonPattern;

public class Manager {
    private static Manager INSTANCE = null;

    private Manager() {

    }

    public static Manager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Manager();
        }

        return INSTANCE;
    }
}

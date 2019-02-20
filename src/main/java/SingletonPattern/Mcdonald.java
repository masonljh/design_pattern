package SingletonPattern;

public class Mcdonald {
    private Manager manager;

    public Mcdonald() {
        manager = Manager.getInstance();
    }

    public Manager getManager() {
        return manager;
    }
}

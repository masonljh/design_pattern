package SingletonPattern;

public class Lotteria {
    private Manager manager;

    public Lotteria() {
        manager = Manager.getInstance();
    }

    public Manager getManager() {
        return manager;
    }
}

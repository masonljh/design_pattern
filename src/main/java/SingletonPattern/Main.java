package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Lotteria store1 = new Lotteria();
        Mcdonald store2 = new Mcdonald();

        System.out.println(store1.getManager().equals(store2.getManager()) ? "같은 매니저입니다." : "다른 매니저입니다.");
    }
}

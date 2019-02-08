package AdapterPattern;

import AdapterPattern.socket.SocketAdapter;
import AdapterPattern.socket.SocketClassAdapterImpl;
import AdapterPattern.socket.SocketObjectAdapterImpl;

public class Main {
    public static void main(String[] args) {
        SocketAdapter adapter = new SocketClassAdapterImpl();
        System.out.println("3Volt : " + adapter.get3Volt().getVolts());
        System.out.println("12Volt : " + adapter.get12Volt().getVolts());
        System.out.println("120Volt : " + adapter.get120Volt().getVolts());

        adapter = new SocketObjectAdapterImpl();
        System.out.println("3Volt : " + adapter.get3Volt().getVolts());
        System.out.println("12Volt : " + adapter.get12Volt().getVolts());
        System.out.println("120Volt : " + adapter.get120Volt().getVolts());
    }
}

package Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.name = "S1";
        s2.name = "S2";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

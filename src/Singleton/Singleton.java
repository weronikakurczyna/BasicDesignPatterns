package Singleton;

public class Singleton {
    private static Singleton instance = null;
    public String name;

    private Singleton() {
        System.out.println("Singleton created");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/*
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public String name;

    private Singleton() {
    }
}
*/



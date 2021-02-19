package AbstractFactoryExamples.rg;

import AbstractFactoryExamples.rg.factories.GUIFactory;
import AbstractFactoryExamples.rg.factories.MacOSFactory;
import AbstractFactoryExamples.rg.factories.WindowsFactory;

public class Demo {
    private static App configureApplication() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}

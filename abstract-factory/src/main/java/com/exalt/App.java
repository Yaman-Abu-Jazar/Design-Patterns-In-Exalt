package com.exalt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}

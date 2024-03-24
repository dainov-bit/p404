import view.*;

/**
 * Точка входа в программу.
 */
public class Application {
    public static void main(String[] args) {
        Window w = new Window("src/data.csv");
        w.run();
    }
}

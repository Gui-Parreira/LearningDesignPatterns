package one.digitalinnovation.gof;

/**
 *Singleton "apressado".
 * @author Gui-Parreira
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

package systemdesign.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    private static volatile Singleton singleton;
    private static boolean instanceCreated = false;

    private Singleton() {
        if (instanceCreated) {
            throw new RuntimeException("Reflection not allowed: Singleton already created");
        }
        instanceCreated = true;
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }

    protected Object readResolve() throws ObjectStreamException {
        return getSingleton();
    }
}

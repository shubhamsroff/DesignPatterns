package systemdesign.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(50);

        // Normal singleton instance test
        service.execute(() -> {
            Singleton s1 = Singleton.getSingleton();
            Singleton s2 = Singleton.getSingleton();
            System.out.println("Normal instances:");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        });

        // Reflection attack test - should be prevented
        service.execute(() -> {
            try {
                Constructor<Singleton> cons = Singleton.class.getDeclaredConstructor();
                cons.setAccessible(true);
                Singleton refInstance1 = cons.newInstance();
                Singleton refInstance2 = cons.newInstance();
                System.out.println("Reflection instances:");
                System.out.println(refInstance1.hashCode() + " " + refInstance2.hashCode());
            } catch (InvocationTargetException e) {
                System.out.println("Reflection attack prevented: " + e.getTargetException().getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected exception: " + e);
            }
        });

        service.shutdown();
    }
}

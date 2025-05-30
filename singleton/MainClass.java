/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClass {
        
    public static void main(String []args){
       ExecutorService service=Executors.newFixedThreadPool(50);
       
//       service.execute(()->{
//          Singleton sr3=Singleton.getSingleton();
//           System.out.println(sr3.hashCode());
//           
//             Singleton sr5=Singleton.getSingleton();
//           System.out.println(sr5.hashCode());
//           
//             Singleton sr4=Singleton.getSingleton();
//           System.out.println(sr4.hashCode());
//       });
//       
       service.execute(()->{
          Constructor<Singleton>cons;
           try {
               cons = Singleton.class.getDeclaredConstructor();
               cons.setAccessible(true);
          Singleton str3;
          Singleton str4;
           try {
               str3 = cons.newInstance();
               str4 = cons.newInstance();
               System.out.println(str3.hashCode()+" "+str4.hashCode());
           } catch (InstantiationException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IllegalAccessException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IllegalArgumentException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           } catch (InvocationTargetException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           } catch (NoSuchMethodException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SecurityException ex) {
               Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
           }
         
       });
//       
//       service.execute(()->{
//          Singleton sr=Singleton.getSingleton();
//           System.out.println(sr.hashCode());
//       });
       
//       service.execute(()->{
//          Singleton sr=Singleton.getSingleton();
//           System.out.println(sr.hashCode());
//       });
       service.shutdown();
    }
}   

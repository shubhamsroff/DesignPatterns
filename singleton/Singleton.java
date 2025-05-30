
package systemdesign.singleton;

import java.io.Serializable;


public class Singleton implements Cloneable,Serializable{
    
//    Eager Singleton Object Creation
    
//    private static final Singleton singleton=new Singleton();
//    private Singleton(){
//        
//    }
//    public static synchronized Singleton  getStudent(){
//        return singleton;
//    }
    
    
//    Lazy Initialization
    private static volatile Singleton singleton;
    private Singleton() throws Exception{
        if(singleton!=null){
            throw new Exception("Already initialized...");
        }
    }
    
    public static  Singleton getSingleton() throws Exception{
        if(singleton ==null){
            synchronized(Singleton.class){
                singleton=new Singleton();
            }
        }
       
        return singleton;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return singleton;
    }
    
    
}       

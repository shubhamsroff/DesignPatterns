/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.factory;

/**
 *
 * @author Shubham Soni
 */
public class MainClass {
    
    
    public static void main(String []args){
       FactoryClass fc=new FactoryClass();
       Developer d=fc.getDeveloper("Java Developer");
       Developer d2=fc.getDeveloper("Android Developer");
       d.printInfo("Android Developer");
    }
}

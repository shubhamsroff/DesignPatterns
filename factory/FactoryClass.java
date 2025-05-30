/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.factory;

/**
 *
 * @author Shubham Soni
 */
public class FactoryClass {
    
    public Developer getDeveloper(String title){
        
        if(title.equals("Java Developer")){
            return new JavaDeveloper();
        }
        else if(title.equals("Android Developer")){
            return new AndroidDeveloper();
        }
        else{
            return null;
        }
    }
}

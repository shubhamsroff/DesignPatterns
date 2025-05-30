/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.adapter;

/**
 *
 * @author Shubham Soni
 */
public class MainClass {
    
    public static void main(String []args){
        AndroidCharger ac=new TypeCCharger();
        AppleCharger appcharger=new SprinkAppleCharger(ac);
        appcharger.charging();
    }
}

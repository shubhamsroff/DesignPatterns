/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.observable;

/**
 *
 * @author Shubham Soni
 */
public class ShubhObserver implements Observer{

    @Override
    public void notified() {
        System.out.println("New Video has uploaded...");
    }
    
}

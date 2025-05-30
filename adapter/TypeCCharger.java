/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.adapter;

/**
 *
 * @author Shubham Soni
 */
public class TypeCCharger implements AndroidCharger{
        @Override
        public void charging(){
            System.out.println("Mobile Phone has started to charge...");
        }
}

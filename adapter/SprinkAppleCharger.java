/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.adapter;

/**
 *
 * @author Shubham Soni
 */
public class SprinkAppleCharger implements AppleCharger{
        
        private AndroidCharger androidCharger;
        public SprinkAppleCharger(AndroidCharger android){
            this.androidCharger=android;
        }
        
        public void charging(){
              androidCharger.charging();
        }
}

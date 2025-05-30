/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.observable;

/**
 *
 * @author Shubham Soni
 */
public class MainCalling {
    
    
    public static void main(String []args){
        YoutubeChannel yt=new YoutubeChannel();
        Observer shubh=new ShubhObserver();
        Observer shreeRam=new ShreeRamObserver();
        yt.subscribe(shubh);
        yt.subscribe(shreeRam);
        yt.notification();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.observable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shubham Soni
 */
public class YoutubeChannel implements SubjectEvent{

    private List<Observer>list=new ArrayList<>();
    @Override
    public void subscribe(Observer obs) {
        
        list.add(obs);
    }

    @Override
    public void unSubscribe(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notification() {
        for(Observer o:list){
            System.out.println("Notification to each observer...");
            o.notified();
        }
    }
    
    
}

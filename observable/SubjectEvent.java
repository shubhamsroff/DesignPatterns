/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.observable;

/**
 *
 * @author Shubham Soni
 */
public interface SubjectEvent {
    void subscribe(Observer obs);
    void unSubscribe(Observer obs);
    void notification();
}

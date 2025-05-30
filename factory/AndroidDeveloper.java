/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.factory;

/**
 *
 * @author Shubham Soni
 */
public class AndroidDeveloper implements Developer{

    @Override
    public void printInfo(String title) {
        System.out.println("You are a "+title);
    }
    
    
}

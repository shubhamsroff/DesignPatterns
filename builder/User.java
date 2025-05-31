/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemdesign.builder;

/**
 *
 * @author Shubham Soni
 */
public class User {
    private String id;
    private String name;
    private String email;
    
    private User(UserBuilder userBuilder){
        this.id=userBuilder.getId();
        this.name=userBuilder.getName();
        this.email=userBuilder.getEmail();
    }
   
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    @Override
    public String toString(){
        return ""+id+" "+name+" "+email;
    }
    
    static class UserBuilder{
        private String id;
        private String name;
        private String email;

        public UserBuilder setId(String id){
            this.id=id;
            return this;
        }
       
        public UserBuilder setName(String name){
            this.name=name;
            return this;
        }
        
        public UserBuilder setEmail(String email){
            this.email=email;
            return this;
        }
       
        public User build(){
            return new User(this);
        }
    } 
}


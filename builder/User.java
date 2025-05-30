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
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
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

        public void setId(String id){
            this.id=id;
        }
        public String getId(){
            return id;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setEmail(String email){
            this.email=email;
        }
        public String getEmail(){
            return this.email;
        }
        public User build(){
            return new User(this);
        }
    } 
}


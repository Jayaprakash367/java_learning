package object;

import java.util.Scanner;

public class User_Account_security_System {
    private String username;
    private String password;
    private String email;
    private int loginAttempts;
User_Account_security_System(String username,String password,String email){
        this.username=username;
        this.password=password;
        this.email=email;
        this.loginAttempts=0;
    }

    public String getusername(){
        return username;
    }
    public String getemail(){
        return email;
    }
   public void login(String password){
      if(loginAttempts>=3){
        System.out.println("Account locked due to too many failed login attempts.");
        return;
      }
      if(this.password.equals(password)){
        System.out.println("Login successful!");
        return;
      }else{
        loginAttempts++;
        System.out.println("Incorrect password");
        if(loginAttempts>=3){
          System.out.println("Account locked due to too many failed login attempts.");
          return;
        }
      }
   }
   public void resetpassword(String oldp,String newp){
    if(this.password.equals(oldp)){
        this.password=newp;
        System.out.println("Password reset successful!");
        return;
    }else{
        System.out.println("Incorrect old password");
    }
   }
}

class User_Account_security_System_test {
    public static void main(String[] args) {
      
        User_Account_security_System user = new User_Account_security_System("john", "password123", "john.doe@example.com");
        System.out.println("User account created successfully!");
        System.out.println("Username: " + user.getusername());
        System.out.println("Email: " + user.getemail());
        user.login("hello");
         user.login("hello");
          user.login("hello");
        user.resetpassword("password123", "newpassword456");
        user.login("newpassword456");

        
    }
}
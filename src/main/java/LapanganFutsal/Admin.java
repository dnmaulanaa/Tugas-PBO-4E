/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Admin {
    private int idLogin;
    private String username;
    private String password;
    private String status;
    
    public Admin(int idLogin, String username, String password, String status) {
        this.idLogin = idLogin;
        this.username = username;
        this.password = password;
        this.status = status;
    }
    
    public int getIdLogin() {
        return idLogin;
    }
    
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
  public void displayInfo(){
        System.out.println("ID Login: " + idLogin);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + status);
    }
}


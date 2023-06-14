/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Chatbox {
    private String username;
    private String pesan;
    
    public Chatbox(String username, String pesan) {
        this.username = username;
        this.pesan = pesan;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPesan() {
        return pesan;
    }
    
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
      public void displayInfo(){
        System.out.println("Username: " + username);
        System.out.println("Pesan: " + pesan);
    }
}

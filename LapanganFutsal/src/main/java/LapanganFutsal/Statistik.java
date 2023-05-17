/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
import java.util.Date;

public class Statistik {
    private String ip;
    private String tanggal;
    private int hits;
    private String online;
    
    public Statistik(String ip, String tanggal, int hits, String online) {
        this.ip = ip;
        this.tanggal = tanggal;
        this.hits = hits;
        this.online = online;
    }
    
    public String getIp() {
        return ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public int getHits() {
        return hits;
    }
    
    public void setHits(int hits) {
        this.hits = hits;
    }
    
    public String isOnline() {
        return online;
    }
    
    public void setOnline(String online) {
        this.online = online;
    }
    
       public void displayInfo(){
           
        System.out.println("IP: " + ip);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Hits: " + hits);
        System.out.println("Online: " + online);
    }
}

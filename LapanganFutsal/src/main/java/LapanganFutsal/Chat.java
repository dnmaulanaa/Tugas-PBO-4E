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

public class Chat {
    private int idShoutbox;
    private String nama;
    private String email;
    private String pesan;
    private String tanggal;
    private String jam;
    private String aktif;
    
    public Chat(int idShoutbox, String nama, String email, String pesan, String tanggal, String jam, String aktif) {
        this.idShoutbox = idShoutbox;
        this.nama = nama;
        this.email = email;
        this.pesan = pesan;
        this.tanggal = tanggal;
        this.jam = jam;
        this.aktif = aktif;
    }
    
    public int getIdShoutbox() {
        return idShoutbox;
    }
    
    public void setIdShoutbox(int idShoutbox) {
        this.idShoutbox = idShoutbox;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPesan() {
        return pesan;
    }
    
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getJam() {
        return jam;
    }
    
    public void setJam(String jam) {
        this.jam = jam;
    }
    
    public String isAktif() {
        return aktif;
    }
    
    public void setAktif(String aktif) {
        this.aktif = aktif;
    }
    
   public void displayInfo(){
        System.out.println("ID Shoutbox: " + idShoutbox);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Pesan: " + pesan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jam: " + jam);
        System.out.println("Aktif: " + aktif);
    }
}

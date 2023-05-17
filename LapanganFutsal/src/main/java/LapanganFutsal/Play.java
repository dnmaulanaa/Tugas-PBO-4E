/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Play {
    private int id;
    private String kodeOrder;
    private String statusPlay;
    private String administrasi;
    private String keterangan;
    
    public Play(int id, String kodeOrder, String statusPlay, String administrasi, String keterangan) {
        this.id = id;
        this.kodeOrder = kodeOrder;
        this.statusPlay = statusPlay;
        this.administrasi = administrasi;
        this.keterangan = keterangan;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getKodeOrder() {
        return kodeOrder;
    }
    
    public void setKodeOrder(String kodeOrder) {
        this.kodeOrder = kodeOrder;
    }
    
    public String getStatusPlay() {
        return statusPlay;
    }
    
    public void setStatusPlay(String statusPlay) {
        this.statusPlay = statusPlay;
    }
    
    public String getAdministrasi() {
        return administrasi;
    }
    
    public void setAdministrasi(String administrasi) {
        this.administrasi = administrasi;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
     public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Kode Order: " + kodeOrder);
        System.out.println("Status Play: " + statusPlay);
        System.out.println("Administrasi: " + administrasi);
        System.out.println("Keterangan: " + keterangan);
    }
}

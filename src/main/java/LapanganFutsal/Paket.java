/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Paket {
    private int id;
    private String kodePaket;
    private String status;
    private String hari;
    private String tarif;
    private String keterangan;
    
    public Paket(int id, String kodePaket, String status, String hari, String tarif, String keterangan) {
        this.id = id;
        this.kodePaket = kodePaket;
        this.status = status;
        this.hari = hari;
        this.tarif = tarif;
        this.keterangan = keterangan;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getKodePaket() {
        return kodePaket;
    }
    
    public void setKodePaket(String kodePaket) {
        this.kodePaket = kodePaket;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getHari() {
        return hari;
    }
    
    public void setHari(String hari) {
        this.hari = hari;
    }
    
    public String getTarif() {
        return tarif;
    }
    
    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
      public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Kode Paket: " + kodePaket);
        System.out.println("Status: " + status);
        System.out.println("Hari: " + hari);
        System.out.println("Tarif: " + tarif);
        System.out.println("Keterangan: " + keterangan);
      } 
}


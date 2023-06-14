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

public class order {
    private int id;
    private String kodeOrder;
    private String tanggal;
    private String kodeMember;
    private String kodePaket;
    private String jam;
    private String durasi;
    private String lapangan;
    private String total;
    private String status;
    private String dp;
    private String keterangan;
    
    public order(int id, String kodeOrder, String tanggal, String kodeMember, String kodePaket, String jam, String durasi, String lapangan, String total, String status, String dp, String keterangan) {
        this.id = id;
        this.kodeOrder = kodeOrder;
        this.tanggal = tanggal;
        this.kodeMember = kodeMember;
        this.kodePaket = kodePaket;
        this.jam = jam;
        this.durasi = durasi;
        this.lapangan = lapangan;
        this.total = total;
        this.status = status;
        this.dp = dp;
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
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getKodeMember() {
        return kodeMember;
    }
    
    public void setKodeMember(String kodeMember) {
        this.kodeMember = kodeMember;
    }
    
    public String getKodePaket() {
        return kodePaket;
    }
    
    public void setKodePaket(String kodePaket) {
        this.kodePaket = kodePaket;
    }
    
    public String getJam() {
        return jam;
    }
    
    public void setJam(String jam) {
        this.jam = jam;
    }
    
    public String getDurasi() {
        return durasi;
    }
    
    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    public String getLapangan() {
        return lapangan;
    }
    
    public void setLapangan(String lapangan) {
        this.lapangan = lapangan;
    }
    
    public String getTotal() {
        return total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDp() {
        return dp;
    }
    
    public void setDp(String dp) {
        this.dp = dp;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
   
    public void displayInfo(){   
        System.out.println("ID: " +id);
        System.out.println("Kode Order: " + kodeOrder);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Kode Member: " + kodeMember);
        System.out.println("Kode Paket: " + kodePaket);
        System.out.println("Jam: " + jam);
        System.out.println("Durasi: " + durasi);
        System.out.println("Lapangan: " + lapangan);
        System.out.println("Total: " + total);
        System.out.println("Status: " + status);
        System.out.println("DP: " + dp);
        System.out.println("Keterangan: " + keterangan);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Bukutamu {
    private int id;
    private int idTamu;
    private String namaCP;
    private String emailCP;
    private String namaTeam;
    private String kritikSaran;
    
    public Bukutamu(int id, int idTamu, String namaCP, String emailCP, String namaTeam, String kritikSaran) {
        this.id = id;
        this.idTamu = idTamu;
        this.namaCP = namaCP;
        this.emailCP = emailCP;
        this.namaTeam = namaTeam;
        this.kritikSaran = kritikSaran;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdTamu() {
        return idTamu;
    }
    
    public void setIdTamu(int idTamu) {
        this.idTamu = idTamu;
    }
    
    public String getNamaCP() {
        return namaCP;
    }
    
    public void setNamaCP(String namaCP) {
        this.namaCP = namaCP;
    }
    
    public String getEmailCP() {
        return emailCP;
    }
    
    public void setEmailCP(String emailCP) {
        this.emailCP = emailCP;
    }
    
    public String getNamaTeam() {
        return namaTeam;
    }
    
    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }
    
    public String getKritikSaran() {
        return kritikSaran;
    }
    
    public void setKritikSaran(String kritikSaran) {
        this.kritikSaran = kritikSaran;
    }
    
     public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("ID Tamu: " + idTamu);
        System.out.println("Nama CP: " + namaCP);
        System.out.println("Email CP: " + emailCP);
        System.out.println("Nama Team: " + namaTeam);
        System.out.println("Kritik/Saran: " + kritikSaran);
    }
}

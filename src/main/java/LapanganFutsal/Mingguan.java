/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Mingguan {
    private int id;
    private String senin;
    private String selasa;
    private String rabu;
    private String kamis;
    private String jumat;
    private String sabtu;
    private String minggu;
    
    public Mingguan(int id, String senin, String selasa, String rabu, String kamis, String jumat, String sabtu, String minggu) {
        this.id = id;
        this.senin = senin;
        this.selasa = selasa;
        this.rabu = rabu;
        this.kamis = kamis;
        this.jumat = jumat;
        this.sabtu = sabtu;
        this.minggu = minggu;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getSenin() {
        return senin;
    }
    
    public void setSenin(String senin) {
        this.senin = senin;
    }
    
    public String getSelasa() {
        return selasa;
    }
    
    public void setSelasa(String selasa) {
        this.selasa = selasa;
    }
    
    public String getRabu() {
        return rabu;
    }
    
    public void setRabu(String rabu) {
        this.rabu = rabu;
    }
    
    public String getKamis() {
        return kamis;
    }
    
    public void setKamis(String kamis) {
        this.kamis = kamis;
    }
    
    public String getJumat() {
        return jumat;
    }
    
    public void setJumat(String jumat) {
        this.jumat = jumat;
    }
    
    public String getSabtu() {
        return sabtu;
    }
    
    public void setSabtu(String sabtu) {
        this.sabtu = sabtu;
    }
    
    public String getMinggu() {
        return minggu;
    }
    
    public void setMinggu(String minggu) {
        this.minggu = minggu;
    }
    
       public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Senin: " + senin);
        System.out.println("Selasa: " +selasa);
        System.out.println("Rabu: " + rabu);
        System.out.println("Kamis: " + kamis);
        System.out.println("Jumat: " + jumat);
        System.out.println("Sabtu: " + sabtu);
        System.out.println("Minggu: " + minggu);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapanganFutsal;

/**
 *
 * @author Asus
 */
public class Member {
    private int idLogin;
    private String kodeMember;
    private String namaTeam;
    private String namaCP;
    private String teleponCP;
    private String emailCP;
    private String alamat;
    private String keanggotaan;
    private String status;
    private String member;
    private String keterangan;
    
    public Member(int idLogin, String kodeMember, String namaTeam, String namaCP, String teleponCP, String emailCP, String alamat, String keanggotaan, String status, String member, String keterangan) {
        this.idLogin = idLogin;
        this.kodeMember = kodeMember;
        this.namaTeam = namaTeam;
        this.namaCP = namaCP;
        this.teleponCP = teleponCP;
        this.emailCP = emailCP;
        this.alamat = alamat;
        this.keanggotaan = keanggotaan;
        this.status = status;
        this.member = member;
        this.keterangan = keterangan;
    }
    
    public int getIdLogin() {
        return idLogin;
    }
    
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    
    public String getKodeMember() {
        return kodeMember;
    }
    
    public void setKodeMember(String kodeMember) {
        this.kodeMember = kodeMember;
    }
    
    public String getNamaTeam() {
        return namaTeam;
    }
    
    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }
    
    public String getNamaCP() {
        return namaCP;
    }
    
    public void setNamaCP(String namaCP) {
        this.namaCP = namaCP;
    }
    
    public String getTeleponCP() {
        return teleponCP;
    }
    
    public void setTeleponCP(String teleponCP) {
        this.teleponCP = teleponCP;
    }
    
    public String getEmailCP() {
        return emailCP;
    }
    
    public void setEmailCP(String emailCP) {
        this.emailCP = emailCP;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getKeanggotaan() {
        return keanggotaan;
    }
    
    public void setKeanggotaan(String keanggotaan) {
        this.keanggotaan = keanggotaan;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMember() {
        return member;
    }
    
    public void setMember(String member) {
        this.member = member;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
      public void displayInfo(){
        System.out.println("ID Login: " + idLogin);
        System.out.println("Kode Member: " + kodeMember);
        System.out.println("Nama Team: " + namaTeam);
        System.out.println("Nama CP: " + namaCP);
        System.out.println("Telepon CP: " + teleponCP);
        System.out.println("Email CP: " + emailCP);
        System.out.println("Alamat: " + alamat);
        System.out.println("Keanggotaan: " + keanggotaan);
        System.out.println("Status: " + status);
        System.out.println("Member: " + member);
        System.out.println("Keterangan: " + keterangan);
    }
}


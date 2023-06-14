/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class dataSetMember {
    private ArrayList<Integer> idLogin;
    private ArrayList<String> kodeMember;
    private ArrayList<String> namaTeam;
    private ArrayList<String> namaCP;
    private ArrayList<String> teleponCP;
    private ArrayList<String> emailCP;
    private ArrayList<String> alamat;
    private ArrayList<String> keanggotaan;
    private ArrayList<String> status;
    private ArrayList<String> member;
    private ArrayList<String> keterangan;

     public dataSetMember(){
       idLogin=new ArrayList<Integer>();
       kodeMember=new ArrayList<String>();
       namaTeam=new ArrayList<String>();
       namaCP=new ArrayList<String>();
       teleponCP=new ArrayList<String>();
       emailCP=new ArrayList<String>();
       alamat=new ArrayList<String>();
       keanggotaan=new ArrayList<String>();
       status=new ArrayList<String>();
       member=new ArrayList<String>();
       keterangan=new ArrayList<String>();
       
   
   }
//method
   public void insertidLogin(Integer isi){
       this.idLogin.add(isi);
   }
   
   public void insertkodeMember(String isi){
       this.kodeMember.add(isi);
   }
   
   public void insertnamaTeam(String isi){
       this.namaTeam.add(isi);
   }
   
   public void insertnamaCP(String isi){
       this.namaCP.add(isi);
   }
   
   public void insertteleponCP(String isi){
       this.teleponCP.add(isi);
   }
   
   public void insertemailCP(String isi){
       this.emailCP.add(isi);
   }
   
   public void insertalamat(String isi){
       this.alamat.add(isi);
   }
   
   public void insertkeanggotaan(String isi){
       this.keanggotaan.add(isi);
   }
   
   public void insertstatus(String isi){
       this.status.add(isi);
   }
   
   public void insertmember(String isi){
       this.member.add(isi);
   }
   
   public void insertketerangan(String isi){
       this.keterangan.add(isi);
   }
   

  

   //keluaran ArrayList
   public ArrayList<Integer> getrecordidLogin(){
       return this.idLogin;
   }
   
   public ArrayList<String> getrecordkodeMember(){
       return this.kodeMember;
       
   }

   public ArrayList<String> getrecordnamaTeam(){
       return this.namaTeam;
       
   }
   
   public ArrayList<String> getrecordnamaCP(){
       return this.namaCP;
       
   }
   
   public ArrayList<String> getrecordteleponCP(){
      return this.teleponCP;
   }
   
   public ArrayList<String> getrecordemailCP(){
      return this.emailCP;
   }
   
   public ArrayList<String> getrecordalamat(){
      return this.alamat;
   }
   
   public ArrayList<String> getrecordkeanggotaan(){
      return this.keanggotaan;
   
   }
   
    public ArrayList<String> getrecordstatus(){
      return this.status;
   
   }
    
    public ArrayList<String> getrecordmember(){
     return this.member;
   
   }
    public ArrayList<String> getrecordketerangan(){
     return this.keterangan;
   
   }
} 



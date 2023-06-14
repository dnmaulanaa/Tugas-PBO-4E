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

public class dataSetChat {
    private ArrayList<Integer> idShoutbox;
    private ArrayList<String> nama;
    private ArrayList<String> email;
    private ArrayList<String> pesan;
     private ArrayList<String> tanggal;
    private ArrayList<String> jam;
    private ArrayList<String> aktif;
 
     public dataSetChat(){
       idShoutbox=new ArrayList<Integer>();
       nama=new ArrayList<String>();
       email=new ArrayList<String>();
       pesan=new ArrayList<String>();
       tanggal=new ArrayList<String>();
       jam=new ArrayList<String>();
       aktif=new ArrayList<String>();
   
   }
//method
   public void insertidShoutbox(Integer isi){
       this.idShoutbox.add(isi);
   }
   
   public void insertnama(String isi){
       this.nama.add(isi);
   }
   
   public void insertemail(String isi){
       this.email.add(isi);
   }
   
   public void insertpesan(String isi){
       this.pesan.add(isi);
   }
   
   public void inserttanggal(String isi){
       this.tanggal.add(isi);
   }
   
   public void insertjam(String isi){
       this.jam.add(isi);
   }
   
   public void insertaktif(String isi){
       this.aktif.add(isi);
   }
   
   

  

   //keluaran ArrayList
   public ArrayList<Integer> getrecordidShoutbox(){
       return this.idShoutbox;
   }
   
   public ArrayList<String> getrecordnama(){
       return this.nama;
   }
   
   public ArrayList<String> getrecordemail(){
       return this.email;
   }
   
   public ArrayList<String> getrecordpesan(){
       return this.pesan;
       
   }
   public ArrayList<String> getrecordtanggal(){
       return this.tanggal;
   }
   
   public ArrayList<String> getrecordjam(){
       return this.jam;
   }
   
   public ArrayList<String> getrecordaktif(){
       return this.aktif;
   }
   
}

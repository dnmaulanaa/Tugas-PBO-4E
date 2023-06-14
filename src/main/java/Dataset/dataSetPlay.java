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
public class dataSetPlay {
    private ArrayList<Integer> id;
    private ArrayList<String> kodeOrder;
    private ArrayList<String> statusPlay;
    private ArrayList<String> administrasi;
    private ArrayList<String> keterangan;


     public dataSetPlay(){
       id=new ArrayList<Integer>();
       kodeOrder=new ArrayList<String>();
       statusPlay=new ArrayList<String>();
       administrasi=new ArrayList<String>();
       keterangan=new ArrayList<String>();

   
   }
//method
   public void insertid(Integer isi){
       this.id.add(isi);
   }
   
   public void insertkodeOrder(String isi){
       this.kodeOrder.add(isi);
   }
   
   public void insertstatusPlay(String isi){
       this.statusPlay.add(isi);
   }
   
   public void insertadministrasi(String isi){
       this.administrasi.add(isi);
   }
   
   public void insertketerangan(String isi){
       this.keterangan.add(isi);

   }
   
   //keluaran ArrayList
   public ArrayList<Integer> getrecordid(){
       return this.id;
   }
   
   public ArrayList<String> getrecordkodeOrder(){
       return this.kodeOrder;
   
   }
   
   public ArrayList<String> getrecordstatusPlay(){
       return this.statusPlay;

   }
   
   public ArrayList<String> getrecordadministrasi(){
       return this.administrasi;
 
   }
    
    public ArrayList<String> getrecordketerangan(){
       return this.keterangan;


   }
}
    

    

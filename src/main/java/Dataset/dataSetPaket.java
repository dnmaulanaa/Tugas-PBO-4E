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
public class dataSetPaket {
    private ArrayList<Integer> id;
    private ArrayList<String> kodePaket;
    private ArrayList<String> status;
    private ArrayList<String> hari;
    private ArrayList<String> tarif;
    private ArrayList<String> keterangan;


     public dataSetPaket(){
       id=new ArrayList<Integer>();
       kodePaket=new ArrayList<String>();
       status=new ArrayList<String>();
       hari=new ArrayList<String>();
       tarif=new ArrayList<String>();
       keterangan=new ArrayList<String>();


       
   
   }
//method
   public void insertid(Integer isi){
       this.id.add(isi);
   }
   
   public void insertkodePaket(String isi){
       this.kodePaket.add(isi);
   }
   
   public void insertstatus(String isi){
       this.status.add(isi);
   }
   
   public void inserthari(String isi){
       this.hari.add(isi);
   }
   
   public void inserttarif(String isi){
       this.tarif.add(isi);
   }
   
   public void insertketerangan(String isi){
       this.keterangan.add(isi);

   }
   
   //keluaran ArrayList
   public ArrayList<Integer> getrecordid(){
       return this.id;
   }
   
   public ArrayList<String> getrecordkodePaket(){
       return this.kodePaket;
   
   }
   
   public ArrayList<String> getrecordstatus(){
       return this.status;

   }
   
   public ArrayList<String> getrecordhari(){
       return this.hari;
 
   }
   
    public ArrayList<String> getrecordtarif(){
       return this.tarif;

   }
    
    public ArrayList<String> getrecordketerangan(){
       return this.keterangan;


   }
}
    


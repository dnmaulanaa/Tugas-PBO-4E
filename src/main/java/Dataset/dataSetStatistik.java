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
public class dataSetStatistik {
    private ArrayList<Integer> ip;
    private ArrayList<String> tanggal;
    private ArrayList<String> hits;
    private ArrayList<String> online;



     public dataSetStatistik(){
       ip=new ArrayList<Integer>();
       tanggal=new ArrayList<String>();
       hits=new ArrayList<String>();
       online=new ArrayList<String>();
   
   }
//method
   public void insertip(Integer isi){
       this.ip.add(isi);
   }
   
   public void inserttanggal(String isi){
       this.tanggal.add(isi);
   }
   
   public void inserthits(String isi){
       this.hits.add(isi);
   }
   
   public void insertonline(String isi){
       this.online.add(isi);

   }
   
   //keluaran ArrayList
   public ArrayList<Integer> getrecordip(){
       return this.ip;
   }
   
   public ArrayList<String> getrecordtanggal(){
       return this.tanggal;
   
   }
   
   public ArrayList<String> getrecordhits(){
       return this.hits;
       
   }
    
    public ArrayList<String> getrecordonline(){
       return this.online;


   }
}
    

    
    


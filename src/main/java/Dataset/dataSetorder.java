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
public class dataSetorder {
    private ArrayList<Integer> id;
    private ArrayList<String> kodeOrder;
    private ArrayList<String> tanggal;
    private ArrayList<String> kodeMember;
    private ArrayList<String> kodePaket;
    private ArrayList<String> jam;
    private ArrayList<String> durasi;
    private ArrayList<String> lapangan;
    private ArrayList<String> total;
    private ArrayList<String> status;
    private ArrayList<String> dp;
    private ArrayList<String> keterangan;

     public dataSetorder(){
       id=new ArrayList<Integer>();
       kodeOrder=new ArrayList<String>();
       tanggal=new ArrayList<String>();
       kodeMember=new ArrayList<String>();
       kodePaket=new ArrayList<String>();
       jam=new ArrayList<String>();
       durasi=new ArrayList<String>();
       lapangan=new ArrayList<String>();
       total=new ArrayList<String>();
       status=new ArrayList<String>();
       dp=new ArrayList<String>();
       keterangan=new ArrayList<String>();

   
   }
//method
   public void insertid(Integer isi){
       this.id.add(isi);
   }
   
   public void insertkodeOrder(String isi){
       this.kodeOrder.add(isi);
   }
   
   public void inserttanggal(String isi){
       this.tanggal.add(isi);
   }
   
   public void insertkodeMember(String isi){
       this.kodeMember.add(isi);
   }
   
   public void insertkodePaket(String isi){
       this.kodePaket.add(isi);

   }
   
   public void insertjam(String isi){
       this.jam.add(isi);

   }
   
   public void insertdurasi(String isi){
       this.durasi.add(isi);

   }
   
   public void insertlapangan(String isi){
       this.lapangan.add(isi);

   }
   
   public void inserttotal(String isi){
       this.total.add(isi);

   }
   
   public void insertstatus(String isi){
       this.status.add(isi);

   }
   
   public void insertdp(String isi){
       this.dp.add(isi);

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
   
   public ArrayList<String> getrecordtanggal(){
       return this.tanggal;

   }
   
   public ArrayList<String> getrecordkodeMember(){
       return this.kodeMember;
 
   }
    
  
   public ArrayList<String> getrecordkodePaket(){
       return this.kodePaket;

   }
    
   public ArrayList<String> getrecordjam(){
       return this.jam;
       
   }
   
   public ArrayList<String> getrecorddurasi(){
       return this.durasi;

   }
   
   public ArrayList<String> getrecordlapangan(){
       return this.lapangan;

   }
   
   public ArrayList<String> getrecordtotal(){
       return this.total;
       
   }
   
   public ArrayList<String> getrecordstatus(){
       return this.status;
       
   }
   
   public ArrayList<String> getrecorddp(){
       return this.dp;
       
   }
   
   public ArrayList<String> getrecordketerangan(){
       return this.keterangan;
       
   }
   
}

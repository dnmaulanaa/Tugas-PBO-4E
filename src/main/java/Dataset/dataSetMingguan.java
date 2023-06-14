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
public class dataSetMingguan {
    private ArrayList<Integer> id;
    private ArrayList<String> senin;
    private ArrayList<String> selasa;
    private ArrayList<String> rabu;
    private ArrayList<String> kamis;
    private ArrayList<String> jumat;
    private ArrayList<String> sabtu;
    private ArrayList<String> minggu;


     public dataSetMingguan(){
       id=new ArrayList<Integer>();
       senin=new ArrayList<String>();
       selasa=new ArrayList<String>();
       rabu=new ArrayList<String>();
       kamis=new ArrayList<String>();
       jumat=new ArrayList<String>();
       sabtu=new ArrayList<String>();
       minggu=new ArrayList<String>();
       
   
   }
//method
   public void insertid(Integer isi){
       this.id.add(isi);
   }
   
   public void insertsenin(String isi){
       this.senin.add(isi);
   }
   
   public void insertselasa(String isi){
       this.selasa.add(isi);
   }
   
   public void insertrabu(String isi){
       this.rabu.add(isi);
   }
   
   public void insertkamis(String isi){
       this.kamis.add(isi);
   }
   
   public void insertjumat(String isi){
       this.jumat.add(isi);
   }
   
   public void insertsabtu(String isi){
       this.sabtu.add(isi);
   }
   
   public void insertminggu(String isi){
       this.minggu.add(isi);
   }

  

   //keluaran ArrayList
   public ArrayList<Integer> getrecordid(){
       return this.id;
   }
   
   public ArrayList<String> getrecordsenin(){
       return this.senin;
   
   }
   
   public ArrayList<String> getrecordselasa(){
       return this.selasa;

   }
   
   public ArrayList<String> getrecordrabu(){
       return this.rabu;
 
   }
   
    public ArrayList<String> getrecordkamis(){
       return this.kamis;

   }
    
    public ArrayList<String> getrecordjumat(){
       return this.jumat;

   }
    
    public ArrayList<String> getrecordsabtu(){
       return this.sabtu;

   }
    
    public ArrayList<String> getrecordminggu(){
       return this.minggu;

   }
}

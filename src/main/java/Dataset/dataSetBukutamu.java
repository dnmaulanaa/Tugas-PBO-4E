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
public class dataSetBukutamu {
    private ArrayList<Integer> id;
    private ArrayList<Integer> idTamu;
    private ArrayList<String> namaCP;
    private ArrayList<String> emailCP;
     private ArrayList<String> namaTeam;
      private ArrayList<String> kritikSaran;
    

     public dataSetBukutamu(){
       id=new ArrayList<Integer>();
       idTamu=new ArrayList<Integer>();
       namaCP=new ArrayList<String>();
       emailCP=new ArrayList<String>();
       namaTeam=new ArrayList<String>();
       kritikSaran=new ArrayList<String>();
   
   }
//method
   public void insertid(Integer isi){
       this.id.add(isi);
   }
   
   public void insertidTamu(Integer isi){
       this.idTamu.add(isi);
   }
   
   public void insertnamaCP(String isi){
       this.namaCP.add(isi);
   }
   
   public void insertemailCP(String isi){
       this.emailCP.add(isi);
   }
    public void insertnamaTeam(String isi){
       this.namaTeam.add(isi);
   }
     public void insertkritikSaran(String isi){
       this.kritikSaran.add(isi);
   }
   

  

   //keluaran ArrayList
   public ArrayList<Integer> getrecordid(){
       return this.id;
   }
   
   public ArrayList<Integer> getrecordidTamu(){
       return this.idTamu;
   }
   
   public ArrayList<String> getrecordnamaCP(){
       return this.namaCP;
   }
   
   public ArrayList<String> getrecordemailCP(){
       return this.emailCP;
   }
    public ArrayList<String> getrecordnamaTeam(){
       return this.namaTeam;
   }
    public ArrayList<String> getrecordkritikSaran(){
       return this.kritikSaran;
   }
   
   
}
    

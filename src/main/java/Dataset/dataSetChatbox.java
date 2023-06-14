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
public class dataSetChatbox {
    private ArrayList<String> username;
    private ArrayList<String> pesan;

     public dataSetChatbox(){
       username=new ArrayList<String>();
       pesan=new ArrayList<String>();
   
   }
//method
   public void insertusername(String isi){
       this.username.add(isi);
   }
   
   public void insertpesan(String isi){
       this.pesan.add(isi);
   }
   

  

   //keluaran ArrayList
   public ArrayList<String> getrecordusername(){
       return this.username;
   }
   
   public ArrayList<String> getrecordpesan(){
       return this.pesan;

   
}    
}

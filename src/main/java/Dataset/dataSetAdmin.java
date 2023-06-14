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
public class dataSetAdmin {
    private ArrayList<Integer> idLogin;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> status;

     public dataSetAdmin(){
       idLogin=new ArrayList<Integer>();
       username=new ArrayList<String>();
       password=new ArrayList<String>();
       status=new ArrayList<String>();
   
   }
//method
   public void insertidLogin(Integer isi){
       this.idLogin.add(isi);
   }
   
   public void insertusername(String isi){
       this.username.add(isi);
   }
   
   public void insertpassword(String isi){
       this.password.add(isi);
   }
   
   public void insertstatus(String isi){
       this.status.add(isi);
   }
   

  

   //keluaran ArrayList
   public ArrayList<Integer> getrecordidLogin(){
       return this.idLogin;
   }
   
   public ArrayList<String> getrecordusername(){
       return this.username;
   }
   
   public ArrayList<String> getrecordpassword(){
       return this.password;
   }
   
   public ArrayList<String> getrecordstatus(){
       return this.status;
   }
   
}

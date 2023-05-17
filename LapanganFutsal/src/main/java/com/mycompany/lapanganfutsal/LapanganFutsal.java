/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lapanganfutsal;

import LapanganFutsal.Admin;
import LapanganFutsal.Bukutamu;
import LapanganFutsal.Chat;
import LapanganFutsal.Chatbox;
import LapanganFutsal.Member;
import LapanganFutsal.Mingguan;
import LapanganFutsal.Paket;
import LapanganFutsal.Play;
import LapanganFutsal.Statistik;
import LapanganFutsal.order;
import javax.crypto.AEADBadTagException;
 
/**
 *
 * @author Asus
 */

public class LapanganFutsal{
    
public static void main(String[] args) {
        // Membuat objek Lapangan Futsal
        Admin Admin = new Admin(01, "deni", "admin123", "Lunas");
        Admin.displayInfo();
        
        Bukutamu Bukutamu = new Bukutamu (01,001,"Deni Maulana", "denimaulanahidayat068@gmail.com","Barangai","-" );
        Bukutamu.displayInfo();
      
        Chat Chat = new Chat(0, "Deni Maulana", "denimaulanahidayat068", "-","07 Mei", "19:00", "Aktif");
        Chat.displayInfo();
        
        Chatbox Chatbox = new Chatbox ("Deni Maulana Hidayat", "lapangan 1");
        Chatbox.displayInfo();
        
        Member Member = new Member(2,"2110010435", "Lincai Bahabis", "Deden", "085754001312","denimaulanahidayat068", "jl.Merpati", "5 Orang", "Mhsiswa", "-", "Aktif");
        Member.displayInfo();
        
        Mingguan Mingguan = new Mingguan(1, "the mankei", "the project", "Indianpro", "Lincai Bahabis", "operopul", "indiskom", "evos");
        Mingguan.displayInfo();
        
        Paket Paket = new Paket(1, "98434", "Aktif", "Senin", "200000", "-");
        Paket.displayInfo();
        
        Play Play = new Play(1,"958967","Bermain", "200000","-");
        Play.displayInfo();
 
        Statistik Statistik = new Statistik("1", "9 januari ", 2, "Online");
        Statistik.displayInfo();
         
        order order = new order(1, "27234", "8 januari 2022", "6353y", "-", "09:00", "2 Jam", "2", "200000", "Bermain", "200000","Lunas");
        order.displayInfo();
}
}
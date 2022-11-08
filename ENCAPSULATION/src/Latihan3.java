/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Latihan3 {
private String Kode, Nama;
private int HPP, Harga, Stok, Jumlah, Sekarang, Total,Laba;
public void inputKode(String Kode){
    this.Kode = Kode;
}    
public void inputNama(String Nama){
    this.Nama = Nama;
}    
public void inputHPP(int HPP){
    this.HPP = HPP;
}
public void inputHarga(int Harga){
    this.Harga = Harga ;
}    
public void inputStok(int Stok){
    this.Stok = Stok ;
}    
public void inputJumlah(int Jumlah){
    this.Jumlah = Jumlah ;
}    
public void inputSekarang(int Sekarang){
    Sekarang = Stok - Jumlah;
    this.Sekarang = Sekarang;
}    
    
public void inputTotal(int Total){
    Total = Jumlah * Harga;
    this.Total = Total ;
}    
public void inputLaba(int Laba){
    Laba = Harga - HPP;
    this.Laba = Laba ;
}    
public String tampilKode(){
    return Kode;
}
public String tampilNama(){
    return Nama;
}
public int tampilHPP(){
    return HPP;
}
public long tampilStok(){
    return Stok;
}   
public long tampilJumlah(){
    return Jumlah;
}   
public long tampilSekarang(){
    return Sekarang;
}   
public long tampilHarga(){
    return Harga;
}   
public long tampilTotal(){
    return Total;
}   
public long tampilLaba(){
    return Laba;
}   
}

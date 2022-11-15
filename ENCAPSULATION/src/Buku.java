/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Buku {
  String Kode,Nama;
  int Harga,Stok,JumlahJual,HPP;
    
  void input(String kode,String nama, int HPP, int harga,int stok){
    this.Kode = kode;
    this.HPP = HPP;
    this.Nama = nama;
    this.Harga = harga;
    this.Stok = stok;
        
     System.out.println("Kode Barang     : "+this.Kode);
     System.out.println("Nama Barang     : "+this.Nama);
     System.out.println("HPP             : "+this.HPP);
     System.out.println("Harga Jual      : "+this.Harga);
     System.out.println("Stok            : "+this.Stok);
    }
    void Pembelian(int Jumlah){
    if(this.Stok - Jumlah > 0){
       this.JumlahJual = this.JumlahJual + Jumlah;
       this.Stok = this.Stok - this.JumlahJual;
            
       System.out.println("Jumlah Beli  : " + Jumlah);
    }else{
       System.out.println("Stok            : " + this.Stok);
     }   
    }
    void HitungLaba(){
        int laba= (this.JumlahJual * this.Harga) - (this.HPP * this.JumlahJual);
        System.out.println("Stok saat ini   : " + this.Stok);
        System.out.println("Total bayar     : " + this.JumlahJual*this.Harga);
        System.out.println("Laba            : " + laba);
    }
    
}

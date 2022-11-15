/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Buku_Gambar extends Barang {
    
    int HPP,HargaJual,Stok,JumlahJual;
  
    public Buku_Gambar(String Kode,String Nama,int HPP, int HargaJual,int Stok,int JumlahJual){
    super(Kode,Nama);
        this.HPP=HPP;
        this.HargaJual=HargaJual;
        this.Stok=Stok;
        this.JumlahJual=JumlahJual;
    }
    
    public String TampilBuku(){
        return (super.TampilBarang() + "HPP\t\t: "+HPP+"\nHarga Jual\t: "+HargaJual+
                "\nStok\t\t: "+Stok+"\nJumlah Jual\t: "+JumlahJual+
                "\nOUTPUT:"+"\nStok Sekarang\t: "+(Stok-JumlahJual)+
                "\nTotal Bayar\t: "+(JumlahJual*HargaJual)+"\nLaba\t\t: "+
                ((JumlahJual*HargaJual)-(JumlahJual*HPP)));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class JualBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Latihan3 Buku =new Latihan3();
    Buku.inputKode("B001");
    Buku.inputNama("Buku Gambar");
    Buku.inputHPP(2500);
    Buku.inputHarga(3000);
    Buku.inputStok(5);
    Buku.inputJumlah(2);
    
    System.out.println("INPUT : ");
    System.out.println("Kode Barang  : " + Buku.tampilKode());
    System.out.println("Nama Barang  : " + Buku.tampilNama());
    System.out.println("HPP          : " + Buku.tampilHPP());
    System.out.println("Harga Jual   : " + Buku.tampilHarga());
    System.out.println("Stok         : " + Buku.tampilStok());
    System.out.println("Jumlah Jual  : " + Buku.tampilJumlah());
    System.out.println("OUTPUT : ");
    System.out.println("Stok Sekarang: " + Buku.tampilSekarang());
    System.out.println("Total Bayar  : " + Buku.tampilTotal());
    System.out.println("Laba         : " + Buku.tampilLaba());
    
    
    
    }
    
}

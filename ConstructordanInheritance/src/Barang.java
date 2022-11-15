/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Barang {
  
    private final String kode;
    private final String nama;
    
    public Barang(String kode,String nama){
        this.kode=kode;
        this.nama=nama;
    }
    
    public String TampilBarang(){
        return("INPUT:\nKode\t\t: "+kode+"\nNama\t\t: "+nama+"\n");
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class JualBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Buku Beli =new Buku();
        
    Beli.input(JOptionPane.showInputDialog("Masukan Kode"), 
        JOptionPane.showInputDialog("Masukan Nama"), 
        parseInt(JOptionPane.showInputDialog("Masukan HPP")), 
        parseInt(JOptionPane.showInputDialog("Masukan Harga")), 
        parseInt(JOptionPane.showInputDialog("Masukan Stok")));
        
    Beli.Pembelian( parseInt(JOptionPane.showInputDialog("Masukan Jumlah Beli")));
    Beli.HitungLaba();
    }
    
}


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Tambah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String input1, input2;
    int a;
    int b;  
    int hasil;
    
    input1 = JOptionPane.showInputDialog("Masukan Angka Pertama : ");
    input2 = JOptionPane.showInputDialog("Masukan Angka Kedua : ");
    a = Integer.parseInt(input1);
    b = Integer.parseInt(input2);
    hasil = a + b;
    JOptionPane.showMessageDialog(null,input1 +" + "+input2+ " = "+  hasil);
    
    }
    
}

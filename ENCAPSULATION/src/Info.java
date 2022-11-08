/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    SpedaMotor motor =new  SpedaMotor();
    motor.inputMerk("Yahama");
    motor.inputTipe("Vega ZR");
    motor.inputTangki(5);
    motor.inputHarga(2600000);
    System.out.println("Rincian Motor : ");
    System.out.println("Merk   : " + motor.tampilMerk());
    System.out.println("Tipe   : " + motor.tampilTipe());
    System.out.println("Tangki : " + motor.tampilTangki() + "Liter");
    System.out.println("Harga  : " + motor.tampilHarga());

}
    }
    


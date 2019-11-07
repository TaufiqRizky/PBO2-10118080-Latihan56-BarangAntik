/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan56.barangantik;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : "+r.getName());
        r.tampilUmur();
    }
    
}

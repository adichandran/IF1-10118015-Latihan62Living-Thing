/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan62livingthing;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Menampilkan seseorang sedang melakukan
 *                        jalan, bernafas , dan makan
 */
public class IF110118015Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hm = new Human();
        hm.setNama("Adi Chandra Nugraha");
        hm.walk(hm.getNama());
        hm.breath(hm.getNama());
        hm.eat(hm.getNama());
    }
    
}

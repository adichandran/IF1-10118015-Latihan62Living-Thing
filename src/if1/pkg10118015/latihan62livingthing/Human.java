/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan62livingthing;

/**
 *
 * @author ACER
 */
public class Human extends LivingThing{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        super.walk(nama);
        System.out.println(nama + " Sedang Berjalan");
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan berbagai karatker film Detective Conan
 */

public class EriKisaki extends DetectiveConan{
    
    public EriKisaki(String n, int ag, String ch, String g, String p, int cs, String sk) {
        super(n, ag, ch, g, p, cs, sk);
    }
    
    @Override
    public void whoAreYou(){
        System.out.println("I am "+name+". My English Name is Eva Kadan");
    }
    
}

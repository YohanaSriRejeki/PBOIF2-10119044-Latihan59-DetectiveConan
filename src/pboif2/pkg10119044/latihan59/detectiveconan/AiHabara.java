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
public class AiHabara extends DetectiveConan{
    private String abilities2;
    
    public AiHabara(String n, int ag, String ch, String g, String p, int cs, String sk) {
        super(n, ag, ch, g, p, cs, sk);
    }
    
    public String getAbilities(){
        return abilities2;
    }
    
    public void setAbilities(String ab){
        this.abilities2 = ab;
    }
    
    public void abilities(int a){
        System.out.println("Abilities : "+abilities2);
    }
    
    @Override
    public void whoAreYou(){
        System.out.println("I am "+name+". My English Name is Anita Hailey");
    }
    
}

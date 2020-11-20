/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan59.detectiveconan;

/**
 *
 * @author ASUS
 */
public class KogoroMouri extends DetectiveConan{
    private String abilities1;
    
    public KogoroMouri(String n, int ag, String ch, String g, String p, int cs, String sk) {
        super(n, ag, ch, g, p, cs, sk);
    }
    
    public String getAbilities(){
        return abilities1;
    }
    
    public void setAbilities(String ab){
        this.abilities1 = ab;
    }
    
    public void abilities(int a){
        System.out.println("Abilities : "+abilities1);
    }
    
    @Override
    public void whoAreYou(){
        System.out.println("I am "+name+". My English Name is Richard Moore");
    }
    
}

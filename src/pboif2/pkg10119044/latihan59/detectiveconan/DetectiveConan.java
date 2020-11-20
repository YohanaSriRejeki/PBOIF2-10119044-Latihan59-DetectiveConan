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
public class DetectiveConan {
    protected String name;
    protected int age;
    protected String characters;
    protected String gender;
    protected String personality;
    protected int casesSolved;
    protected String skills;
    
    public DetectiveConan(String n, int ag, String ch, String g, String p, int cs, String sk){
        this.name = n;
        this.age = ag;
        this.characters = ch;
        this.gender = g;
        this.personality = p;
        this.casesSolved = cs;
        this.skills = sk;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getCharacters(){
        return characters;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getPersonality(){
        return personality;
    }
    
    public int getCasesSolved(){
        return casesSolved;
    }
    
    public String getSkills(){
        return skills;
    }
    
    public void whoAreYou(){
        System.out.println("Detective Conan Characters");
    }
}

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
public class PBOIF210119044Latihan59DetectiveConan {
    public static void main(String[] args) {
        System.out.println("===Detective Conan Characters==="+"\n");
        
        ShinichiKudo sk = new ShinichiKudo("Conan Edogawa", 16, "protagonist", "male", "brilliant", 291, "intelligence");
        sk.whoAreYou();
        System.out.println("Name        :"+sk.getName());
        System.out.println("Age         :"+sk.getAge());
        System.out.println("Character   :"+sk.getCharacters());
        System.out.println("Gender      :"+sk.getGender());
        System.out.println("Personality :"+sk.getPersonality());
        System.out.println("Cases Solved:"+sk.getCasesSolved());
        System.out.println("Skills      :"+sk.getSkills());
        
        System.out.println();
        RanMouri rm = new RanMouri("Ran Mouri", 17, "protagonist", "female", "patient", 3, "-");
        rm.whoAreYou();
        System.out.println("Name        :"+rm.getName());
        System.out.println("Age         :"+rm.getAge());
        System.out.println("Character   :"+rm.getCharacters());
        System.out.println("Gender      :"+rm.getGender());
        System.out.println("Personality :"+rm.getPersonality());
        System.out.println("Cases Solved:"+rm.getCasesSolved());
        rm.setAbilities("physical prowress");
        rm.abilities();
        
        System.out.println();
        KogoroMouri km = new KogoroMouri("Kogoro Mouri", 37, "protagonist", "male", "overinflated sense of his own importance", 400, "-");
        km.whoAreYou();
        System.out.println("Name        :"+km.getName());
        System.out.println("Age         :"+km.getAge());
        System.out.println("Character   :"+km.getCharacters());
        System.out.println("Gender      :"+km.getGender());
        System.out.println("Personality :"+km.getPersonality());
        System.out.println("Cases Solved:"+km.getCasesSolved());
        km.setAbilities("detectives skills");
        km.abilities(1);
        
        System.out.println();
        AiHabara ah = new AiHabara("Ai Habara", 18, "detective boys", "female", "taste for fashion, fan of popular stars", 0, "acting");
        ah.whoAreYou();
        System.out.println("Name        :"+ah.getName());
        System.out.println("Age         :"+ah.getAge());
        System.out.println("Character   :"+ah.getCharacters());
        System.out.println("Gender      :"+ah.getGender());
        System.out.println("Personality :"+ah.getPersonality());
        System.out.println("Skills      :"+ah.getSkills());
        ah.setAbilities("biochemistry, medical knowledge, detective skills");
        ah.abilities(2);
        
        System.out.println();
        AyumiYoshida ay = new AyumiYoshida("Ayumi Yoshida", 6, "detective boys", "female", "primarily naive and innocent little girl who enjoys adventure", 1, "-");
        ay.whoAreYou();
        System.out.println("Name        :"+ay.getName());
        System.out.println("Age         :"+ay.getAge());
        System.out.println("Character   :"+ay.getCharacters());
        System.out.println("Gender      :"+ay.getGender());
        System.out.println("Personality :"+ay.getPersonality());
        System.out.println("Cases Solved:"+ay.getCasesSolved());
        
        System.out.println();
        MitsuhikoTsuburaya mt = new MitsuhikoTsuburaya("Mitsuhiko Tsuburaya", 7, "detective boys", "male", "like science, smart", 1, "-");
        mt.whoAreYou();
        System.out.println("Name        :"+mt.getName());
        System.out.println("Age         :"+mt.getAge());
        System.out.println("Character   :"+mt.getCharacters());
        System.out.println("Gender      :"+mt.getGender());
        System.out.println("Personality :"+mt.getPersonality());
        System.out.println("Cases Solved:"+mt.getCasesSolved());
        
        System.out.println();
        GentaKojima gk = new GentaKojima("GentaKojima", 7, "detective boys", "male", "self-proclaimed leader of the Detective Boys", 0, "-");
        gk.whoAreYou();
        System.out.println("Name        :"+gk.getName());
        System.out.println("Age         :"+gk.getAge());
        System.out.println("Character   :"+gk.getCharacters());
        System.out.println("Gender      :"+gk.getGender());
        System.out.println("Personality :"+gk.getPersonality());
        
        System.out.println();
        HiroshiAgasa ha = new HiroshiAgasa("Hiroshi Agasa", 53, "Conan's friends", "male", "highly intelligent", 0, "-");
        ha.whoAreYou();
        System.out.println("Name        :"+ha.getName());
        System.out.println("Age         :"+ha.getAge());
        System.out.println("Character   :"+ha.getCharacters());
        System.out.println("Gender      :"+ha.getGender());
        System.out.println("Personality :"+ha.getPersonality());
        
        System.out.println();
        SonokoSuzuki ss = new SonokoSuzuki("Sonoko Suzuki", 17, "Ran's best friends", "female", "impulsiveness, her temper and sense for romanticism. ", 0, "-");
        ss.whoAreYou();
        System.out.println("Name        :"+ss.getName());
        System.out.println("Age         :"+ss.getAge());
        System.out.println("Character   :"+ss.getCharacters());
        System.out.println("Gender      :"+ss.getGender());
        System.out.println("Personality :"+ss.getPersonality());
        
        System.out.println();
        EriKisaki ek = new EriKisaki("Eri Kisaki", 37, "Ran's mother, Kogoro Mouri's wife", "female", "incredibly attractive, intelligent", 0, "judo");
        ek.whoAreYou();
        System.out.println("Name        :"+ek.getName());
        System.out.println("Age         :"+ek.getAge());
        System.out.println("Character   :"+ek.getCharacters());
        System.out.println("Gender      :"+ek.getGender());
        System.out.println("Personality :"+ek.getPersonality());
        System.out.println("Skills      :"+ek.getSkills());
        
        System.out.println();
        HeijiHattori hh = new HeijiHattori("Heiji Hattori", 17, "Shinichi's rival detective", "male", "lighthearted and good-humored, a big fan of baseball, very competitive, ", 33+1200, "Keen Intellect");
        hh.whoAreYou();
        System.out.println("Name        :"+hh.getName());
        System.out.println("Age         :"+hh.getAge());
        System.out.println("Character   :"+hh.getCharacters());
        System.out.println("Gender      :"+hh.getGender());
        System.out.println("Personality :"+hh.getPersonality());
        System.out.println("Cases Solved:"+hh.getCasesSolved());
        System.out.println("Skills      :"+hh.getSkills());
        
        System.out.println();
        KazuhaToyama kt = new KazuhaToyama("Kazuha Toyama", 17, "Heiji Hattori's best friend", "female", "hot temper and can be highly critical of people around her", 0, "-");
        kt.whoAreYou();
        System.out.println("Name        :"+kt.getName());
        System.out.println("Age         :"+kt.getAge());
        System.out.println("Character   :"+kt.getCharacters());
        System.out.println("Gender      :"+kt.getGender());
        System.out.println("Personality :"+kt.getPersonality());
    }   
}

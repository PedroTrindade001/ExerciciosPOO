package desafio03;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{

    List<String> magia = new ArrayList();

    @Override
    public void lvlUp(){
        if (xp >= 100) {
            level += 1;
            mana+= 6;
            vida ++;
            inteligencia+= 6;
            forca ++;
            xp -= 100;
        }
        else System.out.println("Você não tem XP para upar de level");
    }

    public int attack(){
        int dano = 0;
        dano = inteligencia * level + numeroRandomico();
        System.out.println(""+ nome + " atacou e causou " + dano + " de dano");
        return dano;
    }

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }
}

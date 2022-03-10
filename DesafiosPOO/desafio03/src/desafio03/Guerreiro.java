package desafio03;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{

    List<String> habilidades = new ArrayList();

    @Override
    public void lvlUp(){
        if (xp >= 100) {
            level += 1;
            mana++;
            vida += 5;
            inteligencia++;
            forca += 5;
            xp-= 100;
        }
        else System.out.println("Você não tem XP para upar de level");
    }

    public int attack(){
        int dano = 0;
        dano = forca * level + numeroRandomico();
        System.out.println(""+ nome + " atacou e causou " + dano + " de dano");
        return dano;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }
}

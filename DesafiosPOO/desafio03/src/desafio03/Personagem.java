package desafio03;

import java.util.Random;

public class Personagem {
    String nome;
    int vida;
    int mana ;
    float xp;
    int inteligencia;
    int forca;
    int level;
    private static int totalDeContas = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public static void setTotalDeContas(int totalDeContas) {
        Personagem.totalDeContas = totalDeContas;
    }

    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        totalDeContas++;
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
    }

    public void lvlUp(){
    }

    public int numeroRandomico(){
        Random gerador = new Random();
        int numeroRandom = gerador.nextInt(300);
        return numeroRandom;
    }

}

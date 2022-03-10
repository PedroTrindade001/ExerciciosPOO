package desafio03;

public class TestarPersonagem {
    public static void main(String[] args) {
    Mago mago1 = new Mago("Soneca", 10, 10, 500, 10 ,10, 1);
    Guerreiro guerreiro1 = new Guerreiro("Garen", 10, 10, 500, 10 ,10, 1);

    mago1.attack();
    mago1.lvlUp();
    mago1.attack();
    mago1.lvlUp();
    mago1.attack();

    System.out.println();

    guerreiro1.attack();
    guerreiro1.lvlUp();
    guerreiro1.attack();
    guerreiro1.lvlUp();
    guerreiro1.attack();
    guerreiro1.lvlUp();

        //Total de Contas Criadas:
        System.out.println("Total de Contas Criadas: "+ Personagem.getTotalDeContas());

    }
}


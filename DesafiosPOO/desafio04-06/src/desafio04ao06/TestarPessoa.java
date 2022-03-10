package desafio04ao06;

import java.util.ArrayList;
import java.util.List;

public class TestarPessoa {
    public static void main(String[] args) {
        int maisVelho = 0;
        int indexPosicao=0;
        List<Pessoa> galera = new ArrayList<>();
            galera.add(new Pessoa("João", 15));
            galera.add(new Pessoa("Leandro", 21));
            galera.add(new Pessoa("Paulo", 17));
            galera.add(new Pessoa("Jessica", 18));

        for (int i = 0; i < galera.size(); i++){
            if (maisVelho < galera.get(i).getIdade()){
                maisVelho=galera.get(i).getIdade();
                indexPosicao = i;
            }
        }

        System.out.println("Pessoa Mais Velha - " + galera.get(indexPosicao));

        System.out.println();

        System.out.println("Lista de Pessoas: "+ galera);

        for (int i = 0; i < galera.size(); i++){
            if (galera.get(i).getIdade()<18){
                indexPosicao = i;
                galera.remove(indexPosicao);
            }
        }

        System.out.println("Lista de Pessoas: " + galera);

        for (int i = 0; i < galera.size(); i++){
            if (galera.get(i).getNome() == "Jessica"){
                indexPosicao = i;
                System.out.println(galera.get(indexPosicao));
            } else System.out.println("Jessica não está na lista");
        }




    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    String nome;
    String cnpj;
    List<Livro> livros = new ArrayList<>();
    List<VideoGame> videoGames = new ArrayList<>();

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros(){
        System.out.println("---------------------------------------------------------");
        if(livros.isEmpty()) System.out.println("A loja não tem livros no seu estoque");
        else{
            System.out.println("A loja "+ nome + " possui estes livros para venda:");
            System.out.println(livros.toString());
        }
    }

    public void listaVideoGames(){
        System.out.println("---------------------------------------------------------");
        if(videoGames.isEmpty()) System.out.println("A loja não tem video-games no seu estoque");
        else{
            System.out.println("A loja "+ nome + " possui estes video-games para venda:");
            System.out.println(videoGames.toString());
        }
    }

    public double calculaPatrimonio(){
        double patrimonio = 0;
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i< livros.size(); i++){
            patrimonio += livros.get(i).preco * livros.get(i).qtd;
            patrimonio += videoGames.get(i).preco * videoGames.get(i).qtd;
        }
        System.out.println("O patrimonio da loja: " + nome + " é de R$ " + patrimonio);
        return patrimonio;
    }

}

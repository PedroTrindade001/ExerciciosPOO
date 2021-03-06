package model;

import interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    String autor;
    String tema;
    int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        if (tema == "educativo"){
            System.out.println("Livro educativo n?o tem imposto: " + nome);
            return 0;
        }
        else {
            double imposto = 0;
            imposto = (preco * 1.10)-preco;
            System.out.println("R$ "+imposto+ " de impostos sobre o livro "+nome);
            return imposto;
        }
    }

    @Override
    public String toString() {
        return  "Titulo: "+ nome + " , pre?o: " + + preco +
                ", quantidade: " + qtd +
                " em estoque.\n";
    }
}

package model;

import interfaces.Imposto;

public class VideoGame  extends Produto implements Imposto {
    String marca;
    String modelo;
    boolean isUsado;

    public VideoGame() {

    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        if (isUsado == true) {
            imposto = (preco * 1.25) - preco;
            System.out.println("Imposto "+nome+" "+modelo+" usado, R$ " + imposto);
            return imposto;
        } else {
            imposto = (preco * 1.45) - preco;
            System.out.println("Imposto "+nome+" "+modelo+" R$ " + imposto);
            return imposto;
        }
    }

    @Override
    public String toString() {
        return "Video-game: "+ modelo + " , preço: " + + preco +
                ", quantidade: " + qtd +
                " em estoque.\n";
    }
}


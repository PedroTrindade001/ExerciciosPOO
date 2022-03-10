package desafio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int acelerar (){
        velocidade += 20;
        return velocidade;
    }

    public int abastecer (int combustivel){
        int limiteTanque = 60;
        litrosCombustivel += combustivel;
        if (litrosCombustivel > limiteTanque){
            int desperdicio = litrosCombustivel- limiteTanque;
            litrosCombustivel -= desperdicio;
            System.out.println("Desperdicio: "+ desperdicio + "L");
            desperdicio = combustivel - desperdicio;
            System.out.println("Abastecimento maior do que o limite do tanque, voce abasteceu apenas: " + desperdicio + "L");
        }
        return litrosCombustivel;
    }
    public int frear (){
        if (velocidade > 0 && velocidade <= 20) velocidade = 0;
        else if (velocidade > 20) velocidade -= 20;
        else System.out.println("O Carro não está em movimento, logo não pode ser freiado!");
        return velocidade;
    }

    public String pintar (String cor){
        return this.cor = cor;
    }

    public boolean ligar (){
        if (isLigado == false) isLigado = true;
        return isLigado;
    }

    public boolean desligar (){
        if (velocidade > 0) System.out.println("Você não pode ligar o carro em movimento");
        else if (isLigado == true) isLigado = false;
        return isLigado;
    }

}

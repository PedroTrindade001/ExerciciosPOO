package desafio01;

public class TestarVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setPlaca("BRA-1234");
        carro.setCor("Branco");
        carro.setKm(0);
        carro.setLigado(true);
        carro.setLitrosCombustivel(40);
        carro.setVelocidade(0);
        carro.setPreco(50000);

        //Testar Método "frear"
        System.out.println("Velocidade: " + carro.getVelocidade());
        carro.frear();
        System.out.println("Velocidade: " + carro.getVelocidade());

        System.out.println();

        //Testar Método "acelerar"
        System.out.println("Velocidade: " + carro.getVelocidade());
        carro.acelerar();
        System.out.println("Velocidade: " + carro.getVelocidade());

        System.out.println();

        //Testar Método "abastecer"
        System.out.println("Tanque: " + carro.getLitrosCombustivel() + "L");
        carro.abastecer(30);
        System.out.println("Tanque: " + carro.getLitrosCombustivel() + "L");

        System.out.println();

        //Testar Método "pintar"
        System.out.println("Cor: " + carro.getCor());
        carro.pintar("Amarelo");
        System.out.println("Cor: " + carro.getCor());

        System.out.println();

        //Testar Método "ligar"
        System.out.println("Ligado? " + carro.isLigado());
        carro.ligar();
        System.out.println("Ligado? " + carro.isLigado());

        System.out.println();

        //Testar Método "desligar"
        System.out.println("Ligado? " + carro.isLigado());
        carro.desligar();
        System.out.println("Ligado? " + carro.isLigado());
        carro.frear();
        carro.desligar();
        System.out.println("Ligado? " + carro.isLigado());

    }
}


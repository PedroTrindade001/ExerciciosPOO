package desafio07;

public class main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setIdade(20);
        gerente1.setNome("Pedro");
        gerente1.setSalario(15000);
        gerente1.setSalario(gerente1.bonificacao());

        Supervisor supervisor1 = new Supervisor();
        supervisor1.setIdade(21);
        supervisor1.setNome("Carlos");
        supervisor1.setSalario(15000);
        supervisor1.setSalario(supervisor1.bonificacao());

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setIdade(22);
        vendedor1.setNome("Nicolas");
        vendedor1.setSalario(15000);
        vendedor1.setSalario(vendedor1.bonificacao());

        System.out.println(gerente1);
        System.out.println(supervisor1);
        System.out.println(vendedor1);
    }
}


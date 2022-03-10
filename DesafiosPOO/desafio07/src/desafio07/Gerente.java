package desafio07;

public class Gerente extends Funcionario{
    @Override
    public double bonificacao(){
        return salario+10000;
    }
}
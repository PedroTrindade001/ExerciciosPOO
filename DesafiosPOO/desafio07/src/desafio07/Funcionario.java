package desafio07;

public class Funcionario {
    String nome;
    int idade;
    double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario - " +
                "Nome: " + nome +
                " Idade: " + idade +
                " Salario: R$ " + salario
                ;
    }

    public double bonificacao(){
        return salario;
    }
}


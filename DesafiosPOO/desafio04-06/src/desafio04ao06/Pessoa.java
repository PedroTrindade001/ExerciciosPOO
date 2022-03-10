package desafio04ao06;

class Pessoa {
    private String nome;
    private Integer idade;

   public String getNome() {
       return nome;
   }

   public Integer getIdade() {
       return idade;
   }

   public Pessoa(String nome, Integer idade) {
       this.nome = nome;
       this.idade = idade;
   }

   @Override
   public String toString() {
       return
               "Nome: " + nome +
               ", Idade: " + idade;
   }

}

public class Funcionario {

   private String nome;
   private int idade;
   private String bairro;

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

   public String getBairro() {
      return bairro;
   }

   public void setBairro(String bairro) {
      this.bairro = bairro;
   }

   @Override
   public String toString() {
      return "Funcionario{" +
              "nome='" + nome + '\'' +
              ", idade=" + idade +
              ", bairro='" + bairro + '\'' +
              '}';
   }
}

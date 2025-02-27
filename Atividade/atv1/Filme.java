package Atividade.atv1;

public class Filme {
   public String nome;
   public int dataLancamento;
   public String genero;
   
   public Filme(String nome, int dataLancamento, String genero){
      this.nome = nome;
      this.dataLancamento = dataLancamento;
      this.genero = genero;
   }

   public void incioFilme(){
      System.out.println("O filme: " + nome + " começou");
   }
}

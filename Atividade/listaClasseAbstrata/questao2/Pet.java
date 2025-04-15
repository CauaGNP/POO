public abstract class Pet{
  private String nome;
  private int idade;

  public Pet(String nome, int idade){
    if(nome == null || nome.trim().isEmpty()){
      throw new IllegalArgumentException();
    }
    if(idade <= 0){
      throw new IllegalArgumentException(); 
    }
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    if(nome == null || nome.trim().isEmpty()){
      throw new IllegalArgumentException();
    }
    this.nome = nome;
  }

  public int getIdade(){
    return idade;
  }

  public void setIdade(int idade){
    if(idade <= 0){
      throw new IllegalArgumentException(); 
    }
    this.idade = idade;
  }

  public abstract String emitirSom();
  public abstract String reagir(String acao); 
}
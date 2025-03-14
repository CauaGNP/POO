package Aulas.aula3_4;

public class Pessoa {
    private String nome;
    private short idade;

    public Pessoa(){

    }

    public Pessoa(String nome, short idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public short getIdade(){
        return idade;
    }

    public void setIdade(short idade) throws Exception{
        if(idade < 18){
            throw new Exception();
        }

        this.idade = idade;

        // if(idade > 17){
        //     this.idade = idade;
        // }else{
        //     throw new Exception();
        // }
        // Ou usar o try catch
    }

}

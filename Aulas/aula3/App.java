package Aulas.aula3;

public class App {
    public static void main(String [] args){
        Pessoa pessoa1 = new Pessoa("John Doe", (short) 23);
        pessoa1.setNome("Iran Ferreira");
        pessoa1.setIdade((short) 28);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }
}

package Aulas.aula3_4; 

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("John Doe", (short) 23);
        pessoa1.setNome("Iran Ferreira");

        System.out.print("Digite sua idade: ");
        short idade = scanner.nextShort();

        // if(idade >= 18){
        //     pessoa1.setIdade(idade);
        // }else{
        //     System.out.println("Menor de idade, impossível efetuar a atualização"); 
        // }
        // Ou fazer isso no própio setter 

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }
}

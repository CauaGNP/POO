import java.util.ArrayList;
import java.util.List;

public class Musico{
    private String nome;
    private List<Instrumento> instrumentos;

    public Musico(String nome){
        this.nome = nome;
        this.instrumentos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
    }

    public void ensaiarTodos(){
        for(Instrumento i : instrumentos){
            System.out.println(i.tocar());
        }
    }
}
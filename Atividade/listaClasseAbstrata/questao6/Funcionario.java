import java.util.*; 

public class Funcionario{
    private String nome;
    private List<Tarefa> tarefas;

    public Funcionario(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        this.tarefas = new ArrayList<>(); 
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

    public List<Tarefa> getTarefas(){
        return tarefas; 
    }

    public void setTarefas(Tarefa tarefas){
        if(tarefas == null){
            throw new IllegalArgumentException();
        }
        this.tarefas = tarefas; 
    }


    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void resumoTarefas(){
        int numTarefa = 1;
        for(Tarefa t : tarefas){
            System.out.println(numTarefa + "° tarefa:");
            System.out.println("Descrição" + t.getDescricao());
            System.out.println("Prioridade" + t.prioridade());

            numTarefa += 1;
        }
    }
}
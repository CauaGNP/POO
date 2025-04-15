public class TarefaSimples extends Tarefa{
    public TarefaSimples(String descricao, int duracaoHoras){
        super(descricao, duracaoHoras);
    }

    @Override
    public String executar(){
        return "Executando a tarefa " + getDescricao();
    }

    @Override 
    public String prioridade(){
        if(getDuracaoHoras() <= 4){
            return "Prioridade Baixa";
        }else if(getDuracaoHoras <= 6){
            return "Prioridade Média";
        }else{
            return "Prioridade Alta";
        }
    }
}
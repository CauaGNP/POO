public class TarefaComplexa extends Tarefa{
    public TarefaComplexa(String descricao, int duracaoHoras){
        super(descricao, duracaoHoras);
    }

    @Override
    public String executar(){
        return "Executando a tarefa " + getDescricao();
    }

    @Override 
    public String prioridade(){
        if(getDuracaoHoras() <= 8){
            return "Prioridade Baixa";
        }else if(getDuracaoHoras <= 14){
            return "Prioridade Média";
        }else{
            return "Prioridade Alta";
        }
    }
}
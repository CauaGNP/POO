public abstract class Tarefa{
    private String descricao;
    private int duracaoHoras;

    public Tarefa(String descricao, int duracaoHoras){
        if(descricao == null || descricao.trim().isEmpty){
            throw new IllegalArgumentException(); 
        }
        if(duracaoHoras < 1 && duracaoHoras > 24){
            throw new IllegalArgumentException();
        }
        this.descricao = descricao;
        this.duracaoHoras = duracaoHoras;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        if(descricao == null || descricao.trim().isEmpty){
            throw new IllegalArgumentException(); 
        }
        this.descricao = descricao;
    }

    public int getDuracaoHoras(){
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras){
        if(duracaoHoras < 1 && duracaoHoras > 24){
            throw new IllegalArgumentException();
        }
        this.duracaoHoras = duracaoHoras;
    }

    public abstract String executar();
    public abstract String prioridade();
}
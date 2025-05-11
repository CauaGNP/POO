package Atividade.listaInterface.questao02;
import java.util.*;

public class CriadorBasico implements Publicador{
    private String nome;
    private List<String> listPost;

    public CriadorBasico(String nome, List<String> listPost) {
        this.nome = nome;
        this.listPost = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if(nome == null || nome.trim().isEmpty()){
            throw new Exception();
        }
        this.nome = nome;
    }

    public List<String> getListPost() {
        return listPost;
    }

    @Override
    public void criarPost(String conteudo){
        listPost.add(conteudo);
        System.out.println("Conteudo criado");
    };

    @Override
    public void removerPost(int idPost){
        if(idPost >= 0 && idPost < listPost.size()){
            listPost.remove(idPost);
            System.out.println("Post removido, id do post: " + idPost);
        }
       
    };
}

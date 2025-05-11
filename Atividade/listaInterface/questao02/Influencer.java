package Atividade.listaInterface.questao02;

public class Influencer implements Publicador, Comunicador{
    @Override
    public void criarPost(String conteudo){
        System.out.println("Post criado, conteúdo: " + conteudo);
    }

    @Override
    public void removerPost(int idPost){
        System.out.println("Post removido, id do post: " + idPost);
    }

    @Override
    public void enviarMensagem(String usuarioDestino, String mensagem){
        
    }

    @Override
    public void responderMensagem(int idMensagem, String resposta){

    }
}

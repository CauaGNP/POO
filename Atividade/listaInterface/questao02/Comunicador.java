package Atividade.listaInterface.questao02;

public interface Comunicador {
    void enviarMensagem(String usuarioDestino, String mensagem);
    void responderMensagem(int idMensagem, String resposta);
}

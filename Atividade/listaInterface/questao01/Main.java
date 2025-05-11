public class Main {
    public static void main(String[] args) {
        EntregaAerea ea = new EntregaAerea("Av.Liberdade", 20);
        EntregaTerrestre et = new EntregaTerrestre("Rua do príncipe", 40);

        ea.calcularFrete(30);
        et.calcularFrete(30);

        try {
            ea.setEnderecoEntrega(null);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o endereço da entrega " + e);
        }

        ea.descricaoRota();
        et.descricaoRota();
    }
}
public class Main {
    public static void main(String[] args){
        bankAccount user1 = new bankAccount("John Doe", "234");

        try {
            user1.deposit(-4);
        } catch (Exception e) {
            System.out.println("Erro ao depositar.Erro: " + e); 
        } 
    }
}

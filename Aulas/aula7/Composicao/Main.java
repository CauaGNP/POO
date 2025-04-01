public class Main{
    public static void main(String[] args) {
        Carro carro = new Carro("Relampago Marquinhos", 2003);
        Motor motor = new Motor("V8", 6.2);
        carro.setMotor(motor);

        System.out.println("---");
        System.out.println(motor);
    }
}
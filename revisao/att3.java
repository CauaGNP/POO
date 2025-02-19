import java.util.Scanner;
public class att3 {
    // psvmsa

    public static double calcualteBMI(double heigth, double weight){
        return weight / (heigth * heigth);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Digite sua idade: ");
        // int ageUser = scanner.nextInt();
        

        // for(int i = 0; i < ageUser; i++){
        //     System.out.println(i + 1 + " Parabens pra você");
        // }
        System.out.print("Digite sua altura: ");
        double heigthUser = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        double weightUser = scanner.nextDouble();
   
        System.out.println(calcualteBMI(heigthUser, weightUser));
    }
}  
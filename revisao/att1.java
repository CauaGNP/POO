public class att1{
    public static class Horse{
        String name;
        int age;
        String color;

        // public Horse(String name, int age, String color){
        //     this.name = name;
        //     this.age = age;
        //     this.color = color;
        // }
        // Podemos utilizar essa forma para criar um construtor.

        void strong(){
            System.out.println("O cavalo é forte paizao");
        }
        void speed(){
            System.out.println("O cavalo é rápido heinn");
        }

        public String toString(){
            return "Nome do cavalo: " + name + " , 3" + "Idade: " + age + " , " + "Cor: " + color;
        }
    }

    public static void main(String[] args){
        Horse roberto = new Horse();
        Horse cleberson = new Horse();

        roberto.name = "Roberto";
        roberto.age = 12;
        roberto.color = "Marrom";

        cleberson.name = "Cleberson";
        cleberson.age = 8;
        cleberson.color = "Preto";
  

        System.out.println(roberto);
        roberto.speed();

        System.out.println(cleberson);
        cleberson.strong();
        }
}
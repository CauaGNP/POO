import java.util.Scanner;

public class att4{
    public static String replaceText(String text){
        return text.replaceAll("[ãâàáä]", "a")   
        .replaceAll("[êèéë]", "e")   
        .replaceAll("[îìíï]", "i")   
        .replaceAll("[õôòóö]", "o")   
        .replaceAll("[ûúùü]", "u")   
        .replace('ç', 'c')    
        .replace('ñ', 'n')   
        .replaceAll("!", "")	                
        .replaceAll ("\\[\\´\\`\\?!\\@\\#\\$\\%\\¨\\*","")
        .replaceAll("\\(\\)\\=\\{\\}\\[\\]\\~\\^\\]","")
        .replaceAll("[\\.\\;\\-\\_\\+\\'\\ª\\º\\:\\;\\/]","")
        .replaceAll(",", "")
        .replaceAll(" ", "");
    }

    public static boolean comparation(String word){

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()- i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String word = scanner.nextLine().toLowerCase();

        String replaceWord = replaceText(word);
        System.out.println(replaceWord);

        String result;

        result =comparation(replaceWord) ? "Sua palavra/frase é um palíndromo!!" :"Sua palavra/frase não é um palíndromo.";
        System.out.println(result);

    }
}
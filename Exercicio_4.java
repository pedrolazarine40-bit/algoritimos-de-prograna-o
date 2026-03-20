//para o scanner funcionar
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
       //mensagem aparece para o usuario
        System.out.println ("Quantos reais voce tem?");
       //atribui o scannner
        Scanner real = new Scanner(System.in);
       //ele le o valor digitado
        double valor = real.nextDouble();
        double divisãoDouble = valor / 5.0;
        System.out.println ("conversão para dollar é: " + divisãoDouble);
    
    }
}
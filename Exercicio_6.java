import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        System.out.println ("Fale um valor em segundos.");
        Scanner valor = new Scanner(System.in);
        double tempo = valor.nextDouble();
        double divisão = (tempo / 60.0) / 60.0;
        double divisãoDouble = tempo / 60.0;
        System.out.println ("Seu tempo em horas " + divisão);
        System.out.println ("Seu tempo em minutos " + divisãoDouble);
        System.out.println ("Seu tempo em segundos " + tempo);
    
    }
}
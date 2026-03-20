import java.util.Scanner;
public class Exercicio_2 {
    public static void main (String[] args){
        System.out.println ("Qual o lado do seu quadrado?");
        Scanner valor = new Scanner(System.in);
        double lado = valor.nextDouble();
        double multiplicaçao = lado * lado;
        System.out.println ("area : " + multiplicaçao);
    }
}
import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        System.out.println("Qual seu peso?");
        Scanner scanner = new Scanner(System.in);
        double peso = scanner.nextDouble();
         System.out.println("Qual sua altura?");
          Scanner tamanho = new Scanner(System.in);
        double altura = tamanho.nextDouble();
        double multiptiplicacao = altura * altura;
        Double divisao = peso / multiptiplicacao;
        System.out.println ("Seu IMC é: " + divisao);
    }
   }
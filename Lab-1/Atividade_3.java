import java.util.Scanner;
public class Atividade_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println( (nota1 + nota2)/ 2 >= 7
        ? "Aprovado"
        : (nota1 + nota2)/ 2 < 7 && (nota1 + nota2)/ 2 >= 3
        ? "Prova Final"
        : "Reprovado");

    }
}

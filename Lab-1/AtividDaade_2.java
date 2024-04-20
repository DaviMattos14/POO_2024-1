import java.util.*;
public class AtividDaade_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.printf("\nNome: %s\nIdade: %d\nAltura:%.2f", nome, idade, altura);

    }
}

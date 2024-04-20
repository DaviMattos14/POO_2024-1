import java.util.Scanner;
public class Atividade_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tempo = sc.nextInt();
        double vm = sc.nextInt();

        double litros = (vm * tempo) / 12;

        System.out.printf("%.3f", litros);

    }
}

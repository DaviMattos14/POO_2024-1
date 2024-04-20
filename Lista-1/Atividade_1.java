import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args){
        
        ArrayList notas = new ArrayList<Double>();
        double somaNotas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double entrada = sc.nextDouble();

        while (entrada != -1) {
            
            somaNotas += entrada;
            System.out.print("Digite a nota: ");
            entrada = sc.nextDouble();
            notas.add(entrada);
        }

        System.out.printf("\nMedia: %.2f\n", (somaNotas / notas.size()));
    }
}

import java.util.Scanner;
import java.util.Random;

public class Atividade_6 {
    private static int getRandomNumberInRange(int min, int max) {

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, min = 0, max = 101;
        String entrada = "";
        int num = getRandomNumberInRange(min, max);
        while (entrada.equalsIgnoreCase("Sim") == false){

            System.out.printf("Seu numero eh %d ?\n", num);
            entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("Sim") == false) {

                System.out.println("Maior ou menor?");
                entrada = sc.nextLine();
                if (entrada.equalsIgnoreCase("menor") == true) {
                    max = num - 1;
                    num = getRandomNumberInRange(min, max);
                    i++;
                }
                if (entrada.equalsIgnoreCase("maior") == true) {
                    min = num + 1;
                    num = getRandomNumberInRange(min, max);
                    i++;
                }
            }
        }
        System.out.printf("\nForam um total de %d iteracoes\n",i);
    }
}

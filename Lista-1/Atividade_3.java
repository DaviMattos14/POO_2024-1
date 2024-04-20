import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        System.out.printf("VOLUME = %.3f\n", ((4/3.0) * (3.14159 * Math.pow( r , 3 ))));

    }
}

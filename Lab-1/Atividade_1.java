import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        double R, r, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        R = sc.nextDouble();
        r = sc.nextDouble();
        System.out.println((pi*(Math.pow(R,2)-Math.pow(r, 2))));

    }
}

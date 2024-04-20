import java.util.Scanner;
public class Atividade_4 {
    static int factorial( int n ) {
        return n != 0 ? n * factorial(n-1) : 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        System.out.printf("\n%d! = %d",num, factorial(num));
    }
}

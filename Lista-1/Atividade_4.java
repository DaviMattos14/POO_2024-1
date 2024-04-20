import java.util.Scanner;
public class Atividade_4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String operador="", input="";

        System.out.println("Escolha uma operacao:\nSoma: +\nSubtracao: -\nMultiplicacao: *\nDivisao: /\n");
        while (input.equals("s") == false) {
            operador = input;
            input = sc.nextLine();
        }

        System.out.println("Digite dois numeros");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        switch (operador) {
            case "+":
            System.out.println(num1+num2);
                break;
            case "-":
            System.out.println(num1-num2);
                break;
            case "*":
            System.out.println(num1*num2);
                break;
            case "/":
            System.out.println(num1/num2);
                break;
        }

    }
}

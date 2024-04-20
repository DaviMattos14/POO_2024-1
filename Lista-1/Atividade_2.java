import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int d_Frango = sc.nextInt(), d_Bife = sc.nextInt(), d_Massa = sc.nextInt();

        int p_Frango = sc.nextInt(), p_Bife = sc.nextInt(),p_Massa = sc.nextInt();
        
        int resp = 0;

        if (d_Frango < p_Frango)
            resp += Math.abs(d_Frango - p_Frango);
        if (d_Bife < p_Bife)
            resp += Math.abs(d_Bife - p_Bife);
        if (d_Massa < p_Massa)
            resp += Math.abs(d_Massa - p_Massa);

        System.out.println(resp);
    }
    
}

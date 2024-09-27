package exercicios_repeticao;
import java.util.Scanner;

public class Bee_1037_Java {

	public static void main(String[] args) {
		 
        Scanner ler = new Scanner(System.in);
        double dig;
        
        dig = ler.nextDouble();
        
        if (dig < 0 || dig > 100) System.out.println("Fora de intervalo");
        if (dig >= 0 && dig <= 25) System.out.println("Intervalo [0,25]");
        if (dig > 25 && dig <= 50) System.out.println("Intervalo (25,50]");
        if (dig > 50 && dig <= 75) System.out.println("Intervalo (50,75]");
        if (dig > 75 && dig <= 100) System.out.println("Intervalo (75,100]");
 
        ler.close();
    }

}

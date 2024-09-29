package exercicios;
import java.util.Scanner;

public class Bee_1044_Java {

	 public static void main(String[] args)  {
		 
	        Scanner ler = new Scanner(System.in);
	        int a,b;
	        
	        a = ler.nextInt();
	        b = ler.nextInt();
	        
	        if( a % b == 0 || b % a == 0){
	            System.out.println("Sao Multiplos");
	            
	        } else {
	            System.out.println("Nao sao Multiplos"); 
	        }
	 
	    }

}

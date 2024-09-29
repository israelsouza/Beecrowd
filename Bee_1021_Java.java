package exercicios_repeticao;
import java.util.Scanner;

public class Bee_1021_Java {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0;
        int m1=0, m50=0, m25=0, m10=0, m5=0, m01=0;
        double dig;

        dig = ler.nextDouble();
        
        if( dig >= 0 && dig <= 1000000 ) {
        	
        	while (dig >= 100) {
        		n100++;
        		dig = dig - 100;
        	}
        	
        	while (dig >= 50) {
        		n50++;
        		dig = dig - 50;
        	}
        	
        	while (dig >= 20) {
        		n20++;
        		dig = dig - 20;
        	}
        	
        	while (dig >= 10) {
        		n10++;
        		dig = dig - 10;
        	}
        	
        	while (dig >= 5) {
        		n5++;
        		dig = dig - 5;
        	}

            while (dig >= 2) {
        		n2++;
        		dig = dig - 2;
        	}
            
            
            
            while (dig >= 1) {
        		m1++;
        		dig = dig - 1;
        	}

            while (dig >= 0.5) {
        		m50++;
        		dig = dig - 0.50;
        	}

            while (dig >= 0.25) {
        		m25++;
        		dig = dig - 0.25;
        	}

            while (dig >= 0.1) {
        		m10++;
        		dig = dig - 0.1;
        	}

            while (dig >= 0.05) {
        		m5++;
        		dig = dig - 0.05;
        	}

            while (dig > 0.009) {
        		m01++;
        		dig = dig - 0.01;
        		System.out.println(dig);
        	}
        	
        	
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n50 + " nota(s) de R$ 50.00");
		System.out.println(n20 + " nota(s) de R$ 20.00");
		System.out.println(n10 + " nota(s) de R$ 10.00");
		System.out.println(n5 + " nota(s) de R$ 5.00");
		System.out.println(n2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
		System.out.println(m50 + " moeda(s) de R$ 0.50");
		System.out.println(m25 + " moeda(s) de R$ 0.25");
		System.out.println(m10 + " moeda(s) de R$ 0.10");
		System.out.println(m5 + " moeda(s) de R$ 0.05");
		System.out.println(m01 + " moeda(s) de R$ 0.01");

	}

}

package exercicios;
import java.util.Scanner;

public class Bee_1048_Java {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double sal, novoSal;
        int reaj=0;
        
        sal = ler.nextDouble();
        
        if ( sal <= 400 && sal > 0 ) {
            reaj = 15;
            novoSal = (sal * 0.15)+sal;
        } else if ( sal <= 800 ) {
            reaj = 12;
            novoSal = sal * 0.12 + sal;
        } else if ( sal <= 1200 ) {
            reaj = 10;
            novoSal = sal * 0.1 + sal;
        } else if ( sal <= 2000 ) {
            reaj = 7;
            novoSal = sal * 0.07 + sal;
        } else {
            reaj = 4;
            novoSal = sal * 0.04 + sal;
        }
        
        System.out.println(String.format("Novo salario: %.2f",novoSal));
        System.out.println(String.format("Reajuste ganho: %.2f",novoSal-sal));
        System.out.println("Em percentual: "+ reaj + " %");
		
		ler.close();
	}

}

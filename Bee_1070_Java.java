package exercicios;

import java.util.Scanner;

public class Bee_1070_Java {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, cont, aux=0;

		n1 = ler.nextInt();

		for (cont = 0; aux < 6; cont++) {
			if (n1 % 2 != 0) {
				System.out.println(n1);
				n1 = n1 + 2;
				aux++;
			} else {
				n1++;
			}

		}

	}

}

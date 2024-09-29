package exercicios;

import java.util.Scanner;

public class Bee_1064_Java {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float dig, soma = 0, media = 0;
		int i, count = 0;

		for (i = 0; i <= 5; i++) {

			dig = ler.nextFloat();

			if (dig > 0) {
				count++;
				soma = soma + dig;
			}
		}

		media = soma / count;

		System.out.println(count + " valores positivos");
		System.out.println(String.format("%.1f", media));

	}

}

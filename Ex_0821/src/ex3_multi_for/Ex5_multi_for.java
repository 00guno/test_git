package ex3_multi_for;

import java.util.Scanner;

public class Ex5_multi_for {

	public static void main(String[] args) {
		// *****
		// 12345
		// *****
		// 12345
		// *****

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i % 2 == 0) {
					System.out.print( j+ " ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
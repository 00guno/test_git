package ex3_multi_for;

import java.util.Scanner;

public class Ex4_multi_for {

	public static void main(String[] args) {
		// A B C D
		// E F G H
		// I J K L
		Scanner sc = new Scanner(System.in);
		char ch = 'A';
		for(int i = 1; i<=3; i++) {
			for(int j =1; j<=4; j++) {
				System.out.printf("%c", ch++);
			}
			System.out.println();
		}
	}
}

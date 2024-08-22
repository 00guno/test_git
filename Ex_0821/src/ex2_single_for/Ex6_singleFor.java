package ex2_single_for;

import java.util.Scanner;

public class Ex6_singleFor {

	public static void main(String[] args) {
		// 키보드에서 정수 n1 , n2를 입력 받는다
		// 단 n1 , n2의 순서를 다르게 입력받아도 결과는 똑같이 출력
		// -----------------------------
		// 수1 : 3
		// 수2 : 5
		// 결과 : 12

		// 수1 : 5
		// 수2 : 3
		// 결과 : 12
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 number 1 값 : ");
		int n1 = sc.nextInt();
		System.out.print("정수 number 2 값 : ");
		int n2 = sc.nextInt();
		// 변수 두 개의 값을 교환하는 방식
		int result = 0;
		if (n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;

		}

		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			result += i;

		}

		// 결과 출력
		System.out.println("결과: " + result);

	}
}

package ex2_single_for;

import java.util.Scanner;



public class Ex5_singlefor {

	public static void main(String[] args) {
		// 키보드에서 정수 n을 입력받는다
		// 1부터 n 까지의 합을 계산하여 결과를 출력한다
		//-----------------
		// 정수 : 5
		// 결과 : 15
		
		// 정수 : 10
		// 결과 : 55
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int number = sc.nextInt();
		
		for(int i  = 0 ; i <=number; i++)
			sum += i;
		System.out.println("1부터 "  + number + "까지의 합은 " + sum + "입니다");
			
			
		
	} //main

}

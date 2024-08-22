package ex2_single_for;

import java.util.Scanner;

public class Ex4_singleFor {

	public static void main(String[] args) {
		// 키보드에서 값을 받고 , 입력받은 값에 해당하는 구구단을 출력
		// ---------------
		// 값 : 1
		// 2~9 사이의 값을 입력하세요
		
		// 값 : 3
		// 3 * 1 = 3 ... 3 * 9 = 27
		
		Scanner sc = new Scanner(System.in); // 입력값 받을때 무조건 쓰기
		System.out.print("구구단 값 : ");
		int dan = sc.nextInt();
		if( dan <1 || dan >= 10) {
			System.out.println("2~9사이 값만 입력하시오");
		}else {
			for(int i = 1; i<=9; i++ ) {
				System.out.printf("%d x %d  = %d\n" , dan , i ,(dan * i));
			}//for
			
		}
		
		 
			
		}//main
		
		
	}



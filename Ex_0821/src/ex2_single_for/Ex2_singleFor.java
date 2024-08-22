package ex2_single_for;

public class Ex2_singleFor {

	public static void main(String[] args) {

		// 10부터 1까지 감소되는 값 출력하는 for문 작성
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("--------------");
		// 1부터 100까지 반복되는 문장에서 5의 배수만 출력하시오
		System.out.print("1부터 100까지 5의 배수 구하기");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("5의 배수\n = " + i);
			}
			
		}//for
		System.out.println("--------------");
		
		for(int i = 0; i <= 95;) {
			i +=5;
			System.out.println(i); //증감식 없으면 조건식으로 넘어감
			
		}//for
		
		System.out.println("-----------------");
		
		for(int i = 5; i<= 100; i+=5) {
			System.out.println(i);
		}
				

			
			
			
			
			
			
			} // main

		
	}


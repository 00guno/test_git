package ex3_multi_for;

public class Ex1_multi_for {

	public static void main(String[] args) {
		// 다중 for문 : for문 안에 for문이 들어가 있는 경우
			
		//1 2 3 
		// 1 2 3
		for(int i  = 1; i<=2; i++) {   //행(y) 담당
			for(int j = 1; j<=3; j++) {  //열(x) 담당
				
				System.out.print(j + " ");
			}//inner
			
			System.out.println(); //개행
		} //outer
		
		
		//12345
		//12345
		//12345
		for(int i  = 1; i<=3; i++) {   //행(y) 담당
			for(int j = 1; j<=5; j++) {  //열(x) 담당
				
				System.out.print(j + " ");
			}//inner
			
			System.out.println(); //개행
		} //outer
		
		System.out.println("--------------");
		
		//321
		//321
		//321
		
		for(int i  = 1; i<=3; i++) {   //행(y) 담당
			for(int j = 3; j>=1; j--) {  //열(x) 담당
				
				System.out.print(j + " ");
			}//inner
			
			System.out.println(); //개행
		} //outer
		
		
		
		
		
	}//main

}

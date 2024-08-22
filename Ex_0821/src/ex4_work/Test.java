package ex4_work;

public class Test {

	
		public static void main(String[] args) {
			int height = 5;

			for (int i = 1; i <= height; i++) {

				for (int j = height - i; j > 0; j--) {
					System.out.print(" ");
				}

				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("*");
				}

				System.out.println();
			}
			

		        for (int i = 3; i >= 0; i--) {
		            
		            for (int j = height - i; j > 0; j--) {
		                System.out.print(" ");
		            }

		           
		            for (int k = 2 * i - 1; k > 0; k--) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }
		}

	}

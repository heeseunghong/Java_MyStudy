package ex;

public class ForEx2 {

	public static void main(String[] args) {
//		for(int i=0;i<3;i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println("");
//		}
//		
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 1; i < 5; i++) {
//			for (int j = 4; j > 0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3-i; j++) {
					System.out.print(" ");
				}
		for (int j = 0; j < 2*i+1; j++) {
			System.out.print("*");
		}
		System.out.println("");
		}
//		for(int i=0;i<2;i++) {
//			for (int j = 0; j < 7; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		for (int i = 4; i > 0; i--) {
			for (int j = 3+i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 2*i-1; j > 0; j--) {
				System.out.print("*");
			}System.out.println("");
		}
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 3+i; j++) {
				System.out.print(" ");
		}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}}
	


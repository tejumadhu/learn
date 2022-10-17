package week1java;

public class EvenOrOddInArray {

	public static void main(String[] args) {
	
		/*
		 * int a [] = {1,2,3,4,5,6};
		 * 
		 * String even = " "; String odd = " ";
		 * 
		 * for(int i:a) {
		 * 
		 * if(i%2==0) { even = even + " "+ i;
		 * 
		 * } else if (i%2 != 0) { odd = odd + " " + i;
		 * 
		 * }
		 * }
		 * 
		 * System.out.println("Even numbers : "+ even);
		 * System.out.println("Odd numbers : " + odd);
		 */
		int a [] = {1,2,3,4,5,6};
		System.out.println("Even numbers : ");
		for (int i = 0; i<a.length; i++) {
			
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers : ");
		for (int i = 0; i<a.length; i++) {
			
			if(a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		
	}
}
}

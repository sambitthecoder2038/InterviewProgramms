package sdet.interviewprogramms;

public class Swapping2 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are->"+ a + " " + b);	
		
//		Logic 2 - Not using 3rd variable
		a = a + b;//10 + 20 = 30
		b = a - b;//30 - 20 = 10
		a = a - b;//30 -20 = 10
		System.out.println("After swapping values are->"+ a + " " + b);	
	}

}

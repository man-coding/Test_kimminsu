package main;

public class Quiz6 {

	public static int divide(int n1, int n2) {

		if (n2 == 0) {
			return -999;
		}
		int result = n1 / n2;
		return result;

	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		int result1 = divide(num1, num2);
		
		System.out.println(result1);

		int num3 = 10;
		int num4 = 0;
		int result2 = divide(num3, num4);

		System.out.println(result2);
	}

}

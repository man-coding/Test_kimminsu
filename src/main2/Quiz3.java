package main2;

public class Quiz3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 20, 100, 30, 77 };

		int findIndex = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == 20) {
				findIndex = i;
				break;
			}
		}
		System.out.println(findIndex);
	}

}

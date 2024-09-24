package week6.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {

		String name = "changeme";
		char arr[] = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = Character.toUpperCase(arr[i]);
			}

		}
		System.out.println(arr);

	}

}

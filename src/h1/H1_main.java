package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 2, 5, 6 ,7};
		int[] verdrehtesArray = new int[myArray.length];

		for (int i = myArray.length - 1; 0 <= i; i--) {
			verdrehtesArray[myArray.length - 1 - i] = myArray[i];
		}

		for (int i = 0; i < verdrehtesArray.length; i++) {
			System.out.println(verdrehtesArray[i]);
		}

	}

}

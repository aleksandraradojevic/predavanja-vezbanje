package p_28_12_2021_1;

public class HelperMethods {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		
		printArray(array);
		printArrayReverse(array);

	}
	
	public static void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
	}
		
		public static void printArrayReverse(int[] array) {
			
			for (int i = array.length - 1; i >= 0; i--) {
				
				System.out.println(array[i]);
				
			}
		
	}

}
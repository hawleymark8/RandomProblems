package basics;

public class sum28 {

	public static void main(String[] args) {
		/*
		 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
		 * sum28([2, 3, 2, 2, 4, 2]) → true
		 * sum28([2, 3, 2, 2, 4, 2, 2]) → false
		 * sum28([1, 2, 3, 4]) → false

		 */
		boolean sum28Flag;
		
		int[] a1 = new int[] {2, 3, 2, 2, 4, 2};
		sum28Flag = sumTwoEight(a1);
		System.out.println(sum28Flag + " → true");
		
	}

	public static boolean sumTwoEight(int[] nums){
		boolean sum28Flag = false;
		int running2Sum = 0;
		
		for(int n : nums){
			if(n == 2){
				running2Sum += 2;
			}
		}
		
		if(running2Sum == 8){
			sum28Flag = true;
		}
		return sum28Flag;
	}
	
}

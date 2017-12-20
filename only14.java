package basics;

public class only14 {
	
	/*
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * only14([1, 4, 1, 4]) → true
	 * only14([1, 4, 2, 4]) → false
	 * only14([1, 1]) → true
	 */
	
	public static void main(String[] args) {

		boolean only14Flag;
		
		int[] a1 = new int[] {1, 4, 1, 4};
		only14Flag = onlyOneFour(a1);
		System.out.println(only14Flag + " → true");
		
		int[] a2 = new int[] {1, 4, 2, 4};
		only14Flag = onlyOneFour(a2);
		System.out.println(only14Flag + " → false");
		
		
	}

	public static boolean onlyOneFour(int[] nums){
		boolean onesAndFours = false;
		int i = 0;
		
		while(i < nums.length){
			if(nums[i] == 1 || nums[i] == 4)
			{
				onesAndFours = true;
				//System.out.println("current selection: " + nums[i]);
				//System.out.println("index: " + i);
			}
			else {
				onesAndFours = false;
				break;
			}
			i++;
			
		}
		
		return onesAndFours;
		
	}
	
}

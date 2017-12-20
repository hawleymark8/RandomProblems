package basics;

public class sum13 {

	public static void main(String[] args) {
		
		checkAnswers();
		
	}
	
	public static int sumThirteen(int[] nums){
		int runningSum = 0;
		
		//if array length is 0, return 0
		if(nums.length == 0){
			return 0;
		}
		
		//for every number in the array add it to the runningSum
		for(int i = 0; i < nums.length; i++){
			//if number is 13 ignore
			if(nums[i] == 13){
				//do nothing
			}
			//if number is after 13, ignore
			else if(i != 0 && nums[i-1] == 13){
				//do nothing
			}
			else {
			runningSum += nums[i];
			}
		}
		
		return runningSum;
	}

	public static void checkAnswers(){
		/*
		 * Return the sum of the numbers in the array, returning 0 for an empty array. 
		 * Except the number 13 is very unlucky, so it does not count and numbers that 
		 * come immediately after a 13 also do not count.
		 * 
		 * sum13([1, 2, 2, 1]) → 6
		 * sum13([1, 1]) → 2
		 * sum13([1, 2, 2, 1, 13]) → 6
		 * sum13([1, 2, 13, 2, 1, 13]) → 4	
		 * sum13([13, 1, 2, 13, 2, 1, 13]) → 3	
		 * sum13([]) → 0	
		 * sum13([13]) → 0	
		 * sum13([13, 13]) → 0	
		 * sum13([13, 0, 13]) → 0	
		 * sum13([13, 1, 13]) → 0	
		 * sum13([5, 7, 2]) → 14	
		 * sum13([5, 13, 2]) → 5	
		 * sum13([0]) → 0	
		 * sum13([13, 0]) → 0	
		 */	
		int sum;
		
		int[] a1 = new int[] {1, 2, 2, 1};
		sum = sumThirteen(a1);
		System.out.println("sum13 result is " + sum + " → 6");
		
		int[] a2 = new int[] {1, 1};
		sum = sumThirteen(a2);
		System.out.println("sum13 result is " + sum + " → 2");
		
		int[] a3 = new int[] {1, 2, 2, 1, 13};
		sum = sumThirteen(a3);
		System.out.println("sum13 result is " + sum + " → 6");
		
		int[] a4 = new int[] {1, 2, 13, 2, 1, 13};
		sum = sumThirteen(a4);
		System.out.println("sum13 result is " + sum + " → 4");
		
		int[] a5 = new int[] {13, 1, 2, 13, 2, 1, 13};
		sum = sumThirteen(a5);
		System.out.println("sum13 result is " + sum + " → 3");
		
		int[] a6 = new int[] {};
		sum = sumThirteen(a6);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a7 = new int[] {13};
		sum = sumThirteen(a7);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a8 = new int[] {13, 13};
		sum = sumThirteen(a8);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a9 = new int[] {13, 0, 13};
		sum = sumThirteen(a9);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a10 = new int[] {13, 1, 13};
		sum = sumThirteen(a10);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a11 = new int[] {5, 7, 2};
		sum = sumThirteen(a11);
		System.out.println("sum13 result is " + sum + " → 14");
		
		int[] a12 = new int[] {5, 13, 2};
		sum = sumThirteen(a12);
		System.out.println("sum13 result is " + sum + " → 5");
		
		int[] a13 = new int[] {0};
		sum = sumThirteen(a13);
		System.out.println("sum13 result is " + sum + " → 0");
		
		int[] a14 = new int[] {13, 0};
		sum = sumThirteen(a14);
		System.out.println("sum13 result is " + sum + " → 0");
	}
}

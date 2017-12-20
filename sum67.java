package basics;

public class sum67 {

	public static void main(String[] args) {
		
		/*
		 * Return the sum of the numbers in the array, 
		 * except ignore sections of numbers starting with a 6 
		 * and extending to the next 7 (every 6 will be 
		 * followed by at least one 7). Return 0 for no numbers.
		 * sum67([1, 2, 2]) → 5
		 * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
		 * sum67([1, 1, 6, 7, 2]) → 4
		 * sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) → 2	
		 * sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) → 2	
		 * sum67([2, 7, 6, 2, 6, 7, 2, 7]) → 18	
		 * sum67([2, 7, 6, 2, 6, 2, 7]) → 9	
		 * sum67([1, 6, 7, 7]) → 8	
		 * sum67([6, 7, 1, 6, 7, 7]) → 8	
		 * sum67([6, 8, 1, 6, 7]) → 0	
		 * sum67([]) → 0	
		 * sum67([6, 7, 11]) → 11	
		 * sum67([11, 6, 7, 11]) → 22	
		 * sum67([2, 2, 6, 7, 7]) → 11	
		 */

			checkAnswers();
	}

	public static int sumSixSeven(int[] nums){
		int sum = 0;
		boolean ignoreSwitch = false;
		
		//for each index in array
		for (int n : nums){
			//if it's a 7, and ignoreSwitch is off
			if(n == 7 && ignoreSwitch == false){
				//add to sum
				sum += n;
			}
			//else if it's a 7, and ignoreSwitch is on
			else if(n == 7 && ignoreSwitch == true){
				ignoreSwitch = false;
				//ignore it
			}
			//else if it's not a 7, ignoreSwitch is on 
			else if (n != 7 && ignoreSwitch == true){
				//ignore it				
			}
			//else if it's a 6, flip on ignoreSwitch
			else if (n == 6){
				ignoreSwitch = true;
			}
				//ignore it
			//else add to sum b/c it's not a 6, 7 & ignoreSwitch is off
			else{
				sum += n;
			}
		}

		
		return sum;
	}
	
	public static void checkAnswers(){
			
		int sum;
		
		int[] a1 = new int[] {1, 2, 2};
		sum = sumSixSeven(a1);
		System.out.println("sum67 result is " + sum + " → 5");
		
		int[] a2 = new int[] {1, 2, 2, 6, 99, 99, 7};
		sum = sumSixSeven(a2);
		System.out.println("sum67 result is " + sum + " → 5");

		int[] a3 = new int[] {1, 1, 6, 7, 2};
		sum = sumSixSeven(a3);
		System.out.println("sum67 result is " + sum + " → 4");

		int[] a4 = new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
		sum = sumSixSeven(a4);
		System.out.println("sum67 result is " + sum + " → 2");
		
		int[] a5 = new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
		sum = sumSixSeven(a5);
		System.out.println("sum67 result is " + sum + " → 2");
		
		int[] a6 = new int[] {2, 7, 6, 2, 6, 7, 2, 7};
		sum = sumSixSeven(a6);
		System.out.println("sum67 result is " + sum + " → 18");
		
		int[] a7 = new int[] {2, 7, 6, 2, 6, 2, 7};
		sum = sumSixSeven(a7);
		System.out.println("sum67 result is " + sum + " → 9");
		
		int[] a8 = new int[] {1, 6, 7, 7};
		sum = sumSixSeven(a8);
		System.out.println("sum67 result is " + sum + " → 8");
		
		int[] a9 = new int[] {6, 7, 1, 6, 7, 7};
		sum = sumSixSeven(a9);
		System.out.println("sum67 result is " + sum + " → 8");
		
		int[] a10 = new int[] {6, 8, 1, 6, 7};
		sum = sumSixSeven(a10);
		System.out.println("sum67 result is " + sum + " → 0");
		
		int[] a11 = new int[] {};
		sum = sumSixSeven(a11);
		System.out.println("sum67 result is " + sum + " → 0");
		
		int[] a12 = new int[] {6, 7, 11};
		sum = sumSixSeven(a12);
		System.out.println("sum67 result is " + sum + " → 11");

		int[] a13 = new int[] {11, 6, 7, 11};
		sum = sumSixSeven(a13);
		System.out.println("sum67 result is " + sum + " → 22");

		int[] a14 = new int[] {2, 2, 6, 7, 7};
		sum = sumSixSeven(a14);
		System.out.println("sum67 result is " + sum + " → 11");
	}
}

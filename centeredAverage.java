package basics;

public class centeredAverage {
	public static void main(String[] args) {
	
	checkAnswersCenteredAverage();

	}//end main
		
	public static int centeredAverage(int[] nums) {
		//establish vars
		int centeredAverage = 0;		
		int largest;
		int smallest;
		boolean largestNumIgnored = false;
		boolean smallestNumIgnored = false;
		int[] newNums = new int[(nums.length - 2)];
		int counter = 0;
		int runningSum = 0;
		
		//find largest and smallest ints in array 
		largest = getLargest(nums);
		smallest = getSmallest(nums);
		
		//create new array ignoring 1 of the largest and 1 of smallest
		//for each array index in nums, add it to new array after largest/smallest checks
		 for (int i : nums){
			    //if  (i == largestNumber), and largest num has not been ignored yet,
			    //then ignore this one
			    if (i == largest && (largestNumIgnored == false)){
			      largestNumIgnored = true;
			    }			    
			    //else if (i == smallestNumber), and smallest num has not been ignored yet,
			    //then ignore this one
			    else if (i == smallest && (smallestNumIgnored == false)){
			      smallestNumIgnored = true;
			    }			    
			    //else go ahead and add it to new array
			    else {
			      newNums[counter] = i;
			      counter++;
			    }
			  }//end for loop
		
		//compute int average of the new array 
		for(int i : newNums){
			runningSum += i;
		}
			centeredAverage = runningSum / newNums.length;
		return centeredAverage;
	}
	
	public static int getLargest(int[] nums){
		int largest = nums[0];
		for(int i: nums){
			largest = Math.max(i, largest);
		}
		return largest;
	}
	
	public static int getSmallest(int[] nums){
		int smallest = nums[0];
		for(int i: nums){
			smallest = Math.min(i, smallest);
		}
		return smallest;
	}
	
	public static void checkAnswersCenteredAverage(){
		
		/*
		 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
		 * except ignoring the largest and smallest values in the array. 
		 * If there are multiple copies of the smallest value, ignore just one copy, 
		 * and likewise for the largest value. Use int division to produce the final average. 
		 * You may assume that the array is length 3 or more.
		 * 
		 * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5 a1
		 * centeredAverage([1, 2, 3, 4, 100]) → 3 a2
		 * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 a3
		 * centeredAverage([5, 3, 4, 6, 2]) → 4 a4
		 * centeredAverage([5, 3, 4, 0, 100]) → 4 a5
		 * centeredAverage([100, 0, 5, 3, 4]) → 4 a6
		 * centeredAverage([4, 0, 100]) → 4 a7
		 * centeredAverage([0, 2, 3, 4, 100]) → 3 a8
 		 * centeredAverage([1, 1, 100]) → 1 a9
		 * centeredAverage([7, 7, 7]) → 7 a10
		 * centeredAverage([1, 7, 8]) → 7 a11
		 * centeredAverage([1, 1, 99, 99]) → 50 a12
		 * centeredAverage([1000, 0, 1, 99]) → 50 a13
		 * centeredAverage([4, 4, 4, 4, 5]) → 4 a14
		 * centeredAverage([4, 4, 4, 1, 5]) → 4 a15
		 * centeredAverage([6, 4, 8, 12, 3]) → 6 a16
		 * */
		
		int cA;
		
		int[]a1 = new int[] {1, 1, 5, 5, 10, 8, 7}; 
		cA = centeredAverage(a1);
		System.out.println("Centered Average of a1 is " + cA + " → 5");

		int[]a2 = new int[] {1, 2, 3, 4, 100}; 
		cA = centeredAverage(a2);
		System.out.println("Centered Average of a2 is " + cA + " → 3");
		
		int[]a3 = new int[] {-10, -4, -2, -4, -2, 0}; 
		cA = centeredAverage(a3);
		System.out.println("Centered Average of a3 is " + cA + " → -3");
		
		int[]a4 = new int[] {5, 3, 4, 6, 2}; 
		cA = centeredAverage(a4);
		System.out.println("Centered Average of a4 is " + cA + " → 4");
		
		int[]a5 = new int[] {5, 3, 4, 0, 100}; 
		cA = centeredAverage(a5);
		System.out.println("Centered Average of a5 is " + cA + " → 4");
		
		int[]a6 = new int[] {100, 0, 5, 3, 4}; 
		cA = centeredAverage(a6);
		System.out.println("Centered Average of a6 is " + cA + " → 4");
		
		int[]a7 = new int[] {4, 0, 100}; 
		cA = centeredAverage(a7);
		System.out.println("Centered Average of a7 is " + cA + " → 4");
		
		int[]a8 = new int[] {0, 2, 3, 4, 100}; 
		cA = centeredAverage(a8);
		System.out.println("Centered Average of a8 is " + cA + " → 3");
		
		int[]a9 = new int[] {1, 1, 100}; 
		cA = centeredAverage(a9);
		System.out.println("Centered Average of a9 is " + cA + " → 1");
		
		int[]a10 = new int[] {7, 7, 7}; 
		cA = centeredAverage(a10);
		System.out.println("Centered Average of a10 is " + cA + " → 7");
		
		int[]a11 = new int[] {1, 7, 8}; 
		cA = centeredAverage(a11);
		System.out.println("Centered Average of a11 is " + cA + " → 7");
		
		int[]a12 = new int[] {1, 1, 99, 99}; 
		cA = centeredAverage(a12);
		System.out.println("Centered Average of a12 is " + cA + " → 50");
		
		int[]a13 = new int[] {1000, 0, 1, 99}; 
		cA = centeredAverage(a13);
		System.out.println("Centered Average of a13 is " + cA + " → 50");
		
		int[]a14 = new int[] {4, 4, 4, 4, 5}; 
		cA = centeredAverage(a14);
		System.out.println("Centered Average of a14 is " + cA + " → 4");

		int[]a15 = new int[] {4, 4, 4, 1, 5}; 
		cA = centeredAverage(a15);
		System.out.println("Centered Average of a15 is " + cA + " → 4");
		
		int[]a16 = new int[] {6, 4, 8, 12, 3}; 
		cA = centeredAverage(a16);
		System.out.println("Centered Average of a16 is " + cA + " → 6");
	}
	
}//end refresherTake2 class

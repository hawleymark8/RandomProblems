//Sort Fun

package basics;

import java.util.Random;
import java.util.Scanner;

public class sortsTest {

	static int minRange;
	static int maxRange;
	static int arrayAmount;
	static int menuSelection;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the random number sorter!");
		String play = "y";
		
		while(play.equals("y")){
			menuSelection = mainMenu();
			
			switch(menuSelection){
			case 1:
				insertionSort();
				break;
			case 2:
				selectionSort();
				break;
			case 0:
				break;
			}
			
			if(menuSelection != 0){
				System.out.println("Would you like to play again? (y/n)");
				play = sc.next();
				play.toLowerCase();
			}
		}
		
		System.out.println("Thanks for playing!");
		
	}
	
	public static void insertionSort(){
		int[] nums = generateRandArray();
		System.out.println("New Random Array Generated: ");
		printArray(nums);
		
		//InsertionSort!
		for(int i = 1; i < nums.length; i++){
			//set selectedNum
			int selectedNum = nums[i];
			//set inner loop index
			int j = i-1;
			//shift other nums up to make room for selectedNum
			while(j>=0 && nums[j] > selectedNum){
				nums[j+1] = nums[j];
				j--;
			}
			//insert selectedNum at proper index
			nums[j+1] = selectedNum;	
		}
		
		System.out.println("Sorted Array: ");
		printArray(nums);
		return;
	}

	public static void selectionSort(){
		int[] nums = generateRandArray();
		System.out.println("New Random Array Generated: ");
		printArray(nums);
		
		//SelectionSort!
		for(int i = 0; i < nums.length; i++){
			int minIndex = i;
			//Find next minimum index
			for(int j = i+1; j<nums.length; j++){
				if(nums[j] < nums[minIndex]){
					minIndex = j;
				}
			}
			//Swap i and minIndex
			int selectedNum = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = selectedNum;
		} //end for loop
		
		System.out.println("Sorted Array: ");
		printArray(nums);
		return;
	}
	
	public static void printArray(int[] nums){
		System.out.print("{");
		for(int i = 0; i < nums.length; i++){
			System.out.print(" [" + nums[i] + "]");
		}
		System.out.println("}");
	}
	
	public static int mainMenu(){
		
		System.out.println("First, how many numbers do you want to sort?");
		arrayAmount = sc.nextInt();
		
		System.out.println("What's the minimum number you want generated?");
		minRange = sc.nextInt();
		
		System.out.println("What's the maximum number you want generated?");
		maxRange = sc.nextInt();
		
		System.out.println("Now which sort like to use (enter number)?");
		System.out.println("1) Insertion Sort");
		System.out.println("2) Selection Sort");
		System.out.println("0) Exit");
		menuSelection = sc.nextInt();
		
		return menuSelection;
		
	}	

	public static int[] generateRandArray(){
		
		int[] nums = new int[arrayAmount];
		
		System.out.println("Here's your array of random numbers! ");
		for(int i = 0; i < nums.length; i++){
			Random rand = new Random();
			nums[i] = rand.nextInt(maxRange-minRange) + minRange;
		}
		
		return nums;
	}
}

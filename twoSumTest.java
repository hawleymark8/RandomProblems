//https://leetcode.com/problems/two-sum/description/
import java.util.*;

public class twoSumTest {

	public static void main(String[] args) {
		
		int[] testCase = new int[] {3,3};
		int testTarget = 6;
		int[] output = new int[2];
		
//		output = twoSumOne(testCase, testTarget);
		output = twoSumTwo(testCase, testTarget);
		
        System.out.println(output[0] + ", " + output[1]);
		return;
	}
	//Solution 1 Brute Force n^2
	private static int[] twoSumOne(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++) {
        		for(int j = i+1; j < nums.length; j++) {
        			if(nums[i] + nums[j] == target) {
        		        answer[0] = i;
        		        answer[1] = j;
        		        System.out.println(answer[0] + ", " + answer[1]);
        				return answer;
        			}
        			
        		}
        }
        return answer;	
	}
	
	//Solution 2 Complementary Hashmap n
	private static int[] twoSumTwo(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) 
        {
        		if(map.containsKey(nums[i])) {
        			answer[0] = map.get(nums[i]);
            		answer[1] = i;
               	break;
        		}
        		else {
            		map.put(target - nums[i], i);       			
        		}
        }
        return answer;	
	}
}

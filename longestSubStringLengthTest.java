package basics;

import java.util.*;

public class longestSubStringLengthTest {

	public static void main(String[] args) {
	
		//String test = "pwwkew";
		String test = "cadabbehcg";
		//String test = "ca0z93";
		int length = longestSubStringLength(test);
		System.out.println("longest length of substring = " + length);
		
	}
	
	//Initial Brute-Force Attempt
	public static int longestSubStringLength(String inputString) {
		inputString.trim();
		inputString.toLowerCase();
		int maxLength = 0;
		int currLength = 0;
		char[] inputCharArray = new char[inputString.length()]; 
		inputCharArray = inputString.toCharArray();
		ArrayList<Character> repeatingCharBank = new ArrayList<Character>();
		boolean uniqueCharFlag = true;
		int selectedCharIndex = 0;
		
		for(int i = 0 ; i < inputCharArray.length ; i++ ){
			//clear/initialize outer loop variables
			String selectedSubString = "";
			StringBuilder selectedSubStringBuilder = new StringBuilder();
			selectedCharIndex = i;
			repeatingCharBank.clear();
			uniqueCharFlag = true;
			currLength = 0;

			while(selectedCharIndex < inputCharArray.length && uniqueCharFlag){
				//if char at selectedCharIndex is not contained in the repeating char index
				if(!(repeatingCharBank.contains(inputCharArray[selectedCharIndex]))){
					//append to stringBuilder, and add char to repeatingCharBank
					selectedSubStringBuilder.append(inputCharArray[selectedCharIndex]);
					repeatingCharBank.add(inputCharArray[selectedCharIndex]);
				}
				//else set uniqueChar to false
				else{
					uniqueCharFlag = false;
				}
				selectedCharIndex++;
			} //end inner while loop
			
			//convert stringBuilder into selectedSubString
			selectedSubString = selectedSubStringBuilder.toString();
			//set currLength of selectedSubString
			currLength = selectedSubString.length();
			//Compare/Set Max Length
			if(currLength > maxLength){
				maxLength = currLength;
			}
		} //end outer for loop
		return maxLength;
	}
	
}

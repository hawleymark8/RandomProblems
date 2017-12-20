package basics;

public class isPalindromeSolution {

	public boolean isPalindrome(int x) {

		String paltest = "" + x; 							// convert
		paltest.trim(); 									// trim
		char[] paltestarray = new char[paltest.length()]; 	// initialize
															// charArray
		paltestarray = paltest.toCharArray(); 				// populate from paltest
		boolean isPal = false; 								// return value

		for (int i = 0; i < paltestarray.length; i++) { 	// loop through array
			int mirrori = paltest.length() - (i + 1); 		// initialize mirror index
			if (paltestarray[i] == paltestarray[mirrori]) { // check values if
															// [i] = [mirriori]
				isPal = true; 								// still Palindrome
			} else {
				isPal = false; 								// not Palindrome
				break;
			}
			mirrori--;					 					// next mirror index
		}
		return isPal;
	}
}

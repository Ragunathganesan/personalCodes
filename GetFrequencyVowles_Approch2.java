package frequencyVowels;

public class GetFrequencyVowles_Approch2 {

	public static void main(String[] args) {

		// Declare and initialize a String variable named str with the value "Welcome Testleaf".
		
		String str = "Welcome Testleaf";
		
		// Declare and initialize an integer array named count with a length of 5 to store the frequency of vowels (a, e, i, o, u).
		
		int[] count = new int[5];
		
		// Convert the contents of str to lowercase.

			str = str.toLowerCase();
		 
		// Begin a for loop to iterate over each character in str.
			
			for (int i = 0; i < str.length(); i++) {
				
				// Get the character at index i from str and assign it to the char variable ch. 
				
				char ch = str.charAt(i);
				
			}
		
		 // Begin a switch statement to handle different cases based on the value of ch.// If ch is 'a', increment the count of 'a' by 1.
		
		// If ch is 'e', increment the count of 'e' by 1.
		
		// If ch is 'i', increment the count of 'i' by 1.
		
		// If ch is 'o', increment the count of 'o' by 1.
		
		// If ch is 'u', increment the count of 'u' by 1.
		
		// End of switch statement.
		
		// End of for loop.

		
		// Print the frequency of each vowel.
		
		// End of the main method.
		
		// End of the class definition.

	}

}

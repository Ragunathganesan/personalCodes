package frequencyVowels;

import java.util.HashMap;
import java.util.Map;

public class GetFrequencyVowles_Approch1 {

	public static void main(String[] args) {

		// String variable named str with the value "Welcome Testleaf".

		String str = "Welcome Testleaf";

		// Declare and initialize a HashMap named vowelCount with Character keys and
		// Integer values.

		Map<Character, Integer> vowelCount = new HashMap<Character, Integer>();

		// Begin a for-each loop to iterate over each character in the lowercased char
		// array representation of str.

		for (char ch : str.toLowerCase().toCharArray()) {

			// If the current character ch is a vowel (a, e, i, o, u).

			if ("aeiou".indexOf(ch) != -1) {

				// Increment the value associated with the key ch in the vowelCount HashMap by
				// 1, or set it to 1 if the key does not exist.

				vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);

				// End of the if statement.
			}

			// End of the for-each loop.
		}

		// Print the message "Vowel Frequencies: " followed by the contents of the
		// vowelCount HashMap.

		System.out.println("Vowels Frequencies: " + vowelCount);

		// End of the main method.
	}
	// End of the class definition.
}

package OmayoSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEACH {

	private static void main(String[] args) {

		// char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// for (char c = 0; c < vowels.length; c++) {
		// System.out.println(vowels[c]);
		// }

		// System.out.println("---------------------------");
		// for (char c : vowels)

		// System.out.println(c);

		// Total();

		// ForEACH fe = new ForEACH();
		// fe.EvenNumbers();
		// OddNumbers();

		// CompareTwoArrays();

		WordCount();

	}

	public static void Total() {

		int[] num = { 1, 2, 3, 4, 5 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];

		}

		System.out.println(sum);
		System.out.println("-------------------");
	}

	public void EvenNumbers() {
		int sum = 0;

		for (int i = 0; i <= 10; i = i + 2) {

			sum = sum + i;
		}

		System.out.println(sum);

		System.out.println("-------------------");

	}

	public static void OddNumbers() {
		int sum = 0;

		for (int i = 1; i < 10; i = i + 2) {

			// sum = sum + i;
			System.out.println(i);
		}

		System.out.println("-------------------");

	}

	public static void CompareTwoArrays() {
		String[] sourceArray = { "Apple", "Banana", "Orange" };

		String[] targetArray = { "Apple", "Banana", "watermelon", "Oranges", "pear", "Grapes" };

		for (int i = 0; i < sourceArray.length; i++) {

			// System.out.println(sourceArray[i]);

			for (int j = 0; j < targetArray.length; j++) {
				if (sourceArray[i] == targetArray[j]) {
					System.out.println(sourceArray[i] + " found in target array");
					break;
				}
			}
		}

	}

	public static void WordCount() {
		List<String> statement = new ArrayList<>(Arrays.asList("statement", "This", "this", "is", "a", "very", "Very",
				"long", "statement", "this", "this", "is", "Is", "very"));

		int wordCount = 0;
		List<String> countedWords = new ArrayList<String>();

		for (String wordToFind : statement) {
			
			// do not count already counted words
			if (!countedWords.isEmpty()) {
				if (countedWords.contains(wordToFind.toLowerCase()))
					break;
			}
			
			

			for (String currentWord : statement) {

				if (wordToFind.toLowerCase() == currentWord.toLowerCase())

					wordCount = wordCount + 1;
			}

			// storing already counted words
			countedWords.add(wordToFind.toLowerCase());

			System.out.println(wordToFind + " found " + wordCount + " times.");
			wordCount = 0;
		}
	}
}

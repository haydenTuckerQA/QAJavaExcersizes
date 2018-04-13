public class StringRecursor {
	public String stringRecursor(String word) {
		if (word.length() == 1) {
			return word;
		} else {
			char firstChar = word.charAt(0);
			String restOfWord = word.substring(1, word.length());
			if (firstChar == restOfWord.charAt(0)) {
				return firstChar + "-" + stringRecursor(restOfWord);
			} else {
				return firstChar + stringRecursor(restOfWord);
			}
		}
		
	}
}

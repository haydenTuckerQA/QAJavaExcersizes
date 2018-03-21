import java.awt.Toolkit;
import java.util.HashMap;

public class MorseCodeReader {
	private HashMap<String, String> morseCodeToString;
	private HashMap<String, String> stringToMorseCode;
	
	public MorseCodeReader() {
		this.morseCodeToString = generateMorseCodeToStringHashMap();
		this.setStringToMorseCode(flipHashMap());
	}

	private HashMap<String, String> flipHashMap() {
		HashMap<String, String> myNewHashMap = new HashMap<>();
		for(HashMap.Entry<String, String> entry : morseCodeToString.entrySet()){
		    myNewHashMap.put(entry.getValue(), entry.getKey());
		}
		
		return myNewHashMap;
	}

	private HashMap<String, String> generateMorseCodeToStringHashMap() {
		HashMap<String, String> temp = new HashMap<String, String>();
		
		temp.put(".-", "a");
		temp.put("-...", "b");
		temp.put("-.-.", "c");
		temp.put("-..", "d");
		temp.put(".", "e");
		temp.put("..-.", "f");
		temp.put("--.", "g");
		temp.put("....", "h");
		temp.put("..", "i");
		temp.put(".---", "j");
		temp.put("-.-", "k");
		temp.put(".-..", "l");
		temp.put("--", "m");
		temp.put("-.", "n");
		temp.put("---", "o");
		temp.put(".--.", "p");
		temp.put("--.-", "q");
		temp.put(".-.", "r");
		temp.put("...", "s");
		temp.put("-", "t");
		temp.put("..-", "u");
		temp.put("...-", "v");
		temp.put(".--", "w");
		temp.put("-..-", "x");
		temp.put("-.--", "y");
		temp.put("--..", "z");
		
		return temp;
	}
	
	public String convertMorseCodeToSentence(String morseCode) {
		String sentence = "";
		String[] morseWords = morseCode.split(" / ");
		for (String morseWord : morseWords) {
			sentence += (convertMorseCodeToWord(morseWord) + " ");
		}
		
		return sentence;
	}

	private String convertMorseCodeToWord(String morseWord) {
		String word = "";
		String[] morseChars = morseWord.split(" ");
		for (String morseChar : morseChars) {
			word += (convertMorseCodeToChar(morseChar));
		}
		
		return word;
	}
	
	private String convertMorseCodeToChar(String morseChar) {
		String[] dotDashes = morseChar.split("");
		makeNoise(dotDashes);
		return this.morseCodeToString.get(morseChar);
	}
	
	public void makeNoise(String[] dotDashes) {
		for (String dotDash : dotDashes) {
			if (dotDash.equals(".")) {
				Toolkit.getDefaultToolkit().beep();
			} else {
				for(int i = 0; i < 100; i++) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
	
	public String convertSentenceToMorse(String sentence) {
		String morseSentence = "";
		String[] words = sentence.split(" ");
		for (String word : words) {
			
			morseSentence += (convertWordToMorseWord(word) + "/ ");
		}
		
		return morseSentence.substring(0, morseSentence.length() - 3);
	}

	private String convertWordToMorseWord(String word) {
		String morseWord = "";
		String[] chars = word.split("");
		for (String character : chars) {
			morseWord += (convertCharToMorseChar(character) + " ");
		}
		
		return morseWord;
	}
	
	private String convertCharToMorseChar(String character) {
		return this.stringToMorseCode.get(character);
	}

	public HashMap<String, String> getMorseCodeToString() {
		return morseCodeToString;
	}

	public void setMorseCodeToString(HashMap<String, String> morseCodeToString) {
		this.morseCodeToString = morseCodeToString;
	}

	public HashMap<String, String> getStringToMorseCode() {
		return stringToMorseCode;
	}

	public void setStringToMorseCode(HashMap<String, String> stringToMorseCode) {
		this.stringToMorseCode = stringToMorseCode;
	}
}

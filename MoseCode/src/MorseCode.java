
public class MorseCode {

	public static void main(String[] args) {
		MorseCodeReader mcr = new MorseCodeReader();
		
		System.out.println(mcr.convertMorseCodeToSentence(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
		System.out.println(mcr.convertSentenceToMorse("hello sos"));
	}

}

import java.util.ArrayList;

public class Monoalphabetic extends Ciphers {

	public String CipherName() {
		return "Monoalphabetic";
	}
	
	public String Key() {
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Key = "";
		for (int i = 0; i < Alphabet.length(); i++) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int number = (int) (Math.random() * 26);
			
			for (int j = 0; j < numbers.size(); j++) {
				if (numbers.get(i) == number) {
					number = (int) (Math.random() * 26);
				}else {	
				Key += Alphabet.charAt(number);
				numbers.add(number);
				}
			}
		}
		return Key;
	}
}

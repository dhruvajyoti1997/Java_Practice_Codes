package FirstRepo;

import java.util.Optional;

public class OptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "DHRUVAJYOTIPRAMANIK";
		char[] char1 = words.toCharArray();
		//new String[10];
		Optional<Character> checkNull = Optional.ofNullable(char1[5]);
		if (checkNull.isPresent()) {
			char word = char1[5];
			System.out.print(word);
		} else
			System.out.println("word is null");
	}

}

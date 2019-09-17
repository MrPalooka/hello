
public class Bob {

	public static void main(String[] args) {

		String string = "BobBino";
		int gap = 'a' - 'A';

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);
			int C = c;
			
			if (c >= 'A' && c <= 'Z') {

				int FinalC = C + gap;
				char finalc = (char) FinalC;
				string = string.replace(c, finalc);

			}
		}
		System.out.println(string);  // char cur = simple.charat(i) if(...) {syso((char) cup + Gap}

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);
			int C = c;
			if (c >= 'a' && c <= 'z') {

				int FinalC = C - gap;
				char finalc = (char) FinalC;
				string = string.replace(c, finalc);

			}
		}System.out.println(string);

	}

}

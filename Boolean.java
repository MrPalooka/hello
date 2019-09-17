
public class Boolean {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };

		for (boolean flag : flags) {
			System.out.println(flag);
		}

		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == true) {
				continue;
			}

			if (flags[i] == false) {
				flags[i] = true;
			}

		}
		for (boolean flag : flags) {
			System.out.println(flag);
		}

		for (boolean flag : flags) {
			if (flag == true) {
				flag = false;
			} else
				continue;
			System.out.println(flag);
		}
	}
}

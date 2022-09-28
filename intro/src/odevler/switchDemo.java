package odevler;

public class switchDemo {
	public static void switchDemo(String[] args) {

		// fields: Grade value char or string
		char gradeVal = 'D';
		switch (gradeVal) {
		case 'A':
			print("excellent degree");
			break;
		case 'B':
			print("good degree");
			break;
		case 'C':
			print("intermediate degree");
			break;
		case 'D':
			print("bad degree");
			break;
		case 'F':
			print("failed the lesson.");
			break;
		default:
			print("An invalid value.");
		}
	}

	static void print(String msg) {
		System.out.print(msg);
	}
}

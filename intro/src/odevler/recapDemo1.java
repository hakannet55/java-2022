package odevler;

public class recapDemo1 {

	public static void recapDemo1() {
		int say1 = 20;
		int say2 = 25;
		int say3 = 2;

		int enBuyuk = say1;

		if (enBuyuk < say2) {
			enBuyuk = say2;
		}
		if (enBuyuk < say3) {
			enBuyuk = say3;
		}
		print(Integer.toString(enBuyuk));
	}

	static void print(String msg) {
		System.out.print(msg);
	}
}

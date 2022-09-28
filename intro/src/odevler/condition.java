package odevler;

public class condition {
	public static void start() {
		int say = 20;
		String msg = "-";
		if (say > 10) {
			msg = "sayı 10 dan büyüktür";
		} else {
			msg = "sayı 10 dan küçüktür";
		}
		if (say == 10) {
			msg = "eşittir";
		}
		System.out.print(msg);
	}
}

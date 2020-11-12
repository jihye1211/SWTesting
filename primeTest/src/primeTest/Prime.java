package primeTest;

public class Prime {
	public boolean getResult(int Number) {
		int num = Number;
		int count = 0;
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++; // prime number°¡ ¾Æ´Ô
				break;
			}
		}
		if (count == 0) {
			flag = true;
		}
		return flag;
	}
}

package unitTestExample;

public class SimpleCalculator {
	private int result;
	
	public void add(int a, int b) {
		result = a+b;
	}
	public void inc(int c) {
		result += c;
	}
	public int getResult() {
		return result;
	}
	

}

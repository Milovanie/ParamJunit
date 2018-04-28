package mathes;

public class MathUtils {
	public static int add(int a, int b) {
		return a + b;
	}
	
	
	public static int minus(int a, int b) {
		return a - b;
	}
	
	
	public static int del(int a, int b) {
		int res = 0;
		if (a != 0) {
			 res = a / b;
		}
		return res;
	}
	
	
	public static int multi(int a, int b) {
		return a * b;
	}
	
}

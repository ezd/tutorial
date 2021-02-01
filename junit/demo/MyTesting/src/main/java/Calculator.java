
public class Calculator {
	
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	int subtraction(int a, int b) {
		return a - b;
	}
	
	int multiplication(int x, int y) {
		return x * y;
	}
	double division(int x, int y) {
		if(y==0) {
			return 0;
		}
		return x / y;
	}


}

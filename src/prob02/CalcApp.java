package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();

		Arithmetic ex = null;
		
		switch (operation) {
		case "+":
			ex = new Add();
			break;
		case "-":
			ex = new Sub();
			break;
		case "*":
			ex = new Mul();
			break;
		case "/":
			ex = new Div();
			break;
		default:
			ex = null;
			break;
		}

		if (ex != null) {
			System.out.println(ex.calculate(a, b));
		}
		scanner.close();		
	}
}

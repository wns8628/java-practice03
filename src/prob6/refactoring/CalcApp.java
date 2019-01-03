package prob6.refactoring;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();

			String[] cal_num = expression.split(" ");
			
			if(expression.equals("quit")) {
				break;
			}
			
			Arith arith = null;
			switch(cal_num[1]) {
				case "+":
					arith = new Add();
					break;
				case "-":
					arith = new Sub();
					break;
				case "*":
					arith = new Mul();
					break;
				case "/":
					arith = new Div();
//					calc(arith ,cal_num[0],cal_num[2]);
					break;
				default :
					break;
			}
			
			if(arith == null) { 
				System.out.println(">> 알수없는 연산");
				continue;
			}
			
			arith.setValue(Integer.parseInt(cal_num[0]),Integer.parseInt(cal_num[2]));
			int result = arith.calculate();
			System.out.println(">> " + result);
		}
	}
	
}

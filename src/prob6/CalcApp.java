package prob6;

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
			
			switch(cal_num[1]) {
				case "+":
					Add add = new Add();
					add.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
					System.out.println(add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
					System.out.println(sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
					System.out.println(mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
					System.out.println(div.calculate());
					break;
				default :
					System.out.println("제데로입력하라");
					continue;
			}
			
		}
	}
}

package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();

			String[] cal_num = expression.split(" ");
			

			if(cal_num[1].equals("+")) {
				Add add = new Add();
				add.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
				System.out.println(add.calculate());
			}
			if(cal_num[1].equals("-")) {
				Sub sub = new Sub();
				sub.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
				System.out.println(sub.calculate());
			}
			if(cal_num[1].equals("*")) {
				Add add = new Add();
				add.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
				System.out.println(add.calculate());
			}
			if(cal_num[1].equals("/")) {
				Add add = new Add();
				add.setValue(Integer.parseInt(cal_num[0]), Integer.parseInt(cal_num[2]));
				System.out.println(add.calculate());
			}
			
			
		}
	}
}

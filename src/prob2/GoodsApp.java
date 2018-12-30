package prob2;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );		
		
		//3개의공간을만든다
		Goods[] goods = new Goods[COUNT_GOODS];
		String input_goods_string = new String();
		
		for(int i=0; i<COUNT_GOODS; i++) {
			input_goods_string += scanner.nextLine();
			input_goods_string += " ";
		}
		
		String[] input_goods_array = input_goods_string.split(" ");
		
		int j = 0;
		for(int i=0; i<COUNT_GOODS; i++){
			goods[i] = new Goods(input_goods_array[j],input_goods_array[j+1],input_goods_array[j+2]);			
			System.out.println(goods[i].getGoods_name()+"(가격 : " + goods[i].getPrice() + "원)이 " + goods[i].getNumber()+"개 입고 되었습니다." );			
			j = j+3;
		}
		
	}
}

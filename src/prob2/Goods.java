package prob2;

public class Goods {
	
	private String goods_name;
	private String price;
	private String number;
	
	public Goods (String goods_name, String price, String number) {
		this.goods_name = goods_name;
		this.price = price;
		this.number = number;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

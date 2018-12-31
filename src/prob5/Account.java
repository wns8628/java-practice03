package prob5;

public class Account {
	private String accountNo;
	private int balance = 0;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println( this.accountNo + "계좌가 개설되었습니다.");
	}
	
	public void save(int money) {
		System.out.println(this.accountNo +"계좌에" + money+ "만원이 입금되었습니다." );
		this.balance += money;
	}
	
	public void deposit(int money) {
		if( 0 > (this.balance - money)) {
			System.out.println("잔액이 없어서 출금이 안됩니다.");
		}else {
			this.balance -= money;		
			System.out.println(this.accountNo +"계좌에" + money+ "만원이 출금되었습니다." );
		}
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
package co.edu.app;

public class Account {
	//필드 : 계좌번호, 예금주, 잔액
	private String acNo;
	private String acName;
	private int balance;
	
	
	//생성자 : 
	
	public Account(String acNo, String acName, int balance) {
	super();
	this.acNo = acNo;
	this.acName = acName;
	this.balance = balance;
	
	}
	//겟터, 셋터

	//계좌 번호 
	public String getAcNo() {
		return acNo;
	}


	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	//예금주
	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	//잔액
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
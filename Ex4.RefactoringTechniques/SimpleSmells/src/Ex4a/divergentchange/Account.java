package Ex4a.divergentchange;

// Class가 두가지 일을 한다는 가정을 가짐

public class Account {

	private int accountNumber;
	private double balance= 0;

	public Account(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		balance -= amount;
	}

	// XML을 만드는 부분을 새로운 class로 추출

	public String toXml() {
		return new XML(getAccountNumber()).toXml();
	}

}

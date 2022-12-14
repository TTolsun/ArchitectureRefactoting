package Ex4a.duplicatedcode;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Account {

	private float balance = 0;

	private List transactions = new ArrayList();

	private String lastTransactionDate;

	public float getBalance() {
		return balance;
	}

	public void credit(float amount) {
		balance += amount;
		transactions.add(new Transaction(true, amount));
		extracted();
	}

	// 여기를 정리해서 중복 빼내자
	public void debit(float amount) {
		balance -= amount;
		transactions.add(new Transaction(true, -amount));
		extracted();
	}

	private void extracted() {
		Calendar calendar = Calendar.getInstance();
		lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
				calendar.get(Calendar.MONTH) + "/" +
				calendar.get(Calendar.YEAR);
	}

	public Transaction getLastTransaction() {
		return (Transaction)transactions.get(transactions.size()  -1);
	}

	public String getLastTransactionDate() {
		return lastTransactionDate;
	}

}

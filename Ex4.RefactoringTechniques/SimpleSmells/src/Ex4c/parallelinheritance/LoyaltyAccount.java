package Ex4c.parallelinheritance;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class LoyaltyAccount extends Account {

	private int loyaltyPoints = 0;

	public void credit(float amount) {
		executeTransaction(amount);
		loyaltyPoints ++;
	}

}

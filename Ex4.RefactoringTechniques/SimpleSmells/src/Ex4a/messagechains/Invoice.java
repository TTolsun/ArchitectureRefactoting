package Ex4a.messagechains;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class Invoice {

	static final double SHIPPING_COST_OUTSIDE_EU = 10;
	private List<InvoiceItem> invoiceItems = new ArrayList<InvoiceItem>();
	private Customer customer;

	public Invoice(Customer customer) {
		this.customer = customer;
	}

	public void addItem(InvoiceItem invoiceItem) {
		invoiceItems.add(invoiceItem);
	}

	public double getTotalPrice() {
		double invoiceTotal = 0;

		for (Iterator iterator = invoiceItems.iterator(); iterator.hasNext();) {
			InvoiceItem invoiceItem = (InvoiceItem) iterator.next();
			invoiceTotal += invoiceItem.getSubtotal();
		}

		// 얘가 커스터모 간 다음에 어드레스 간다음에 계속 들어감. 이걸 다 짤라서 운영해보는 형태로
		if(!customer.getAddress().getCountry().isInEurope()){
			invoiceTotal += SHIPPING_COST_OUTSIDE_EU;
		}
		return invoiceTotal;
	}


}

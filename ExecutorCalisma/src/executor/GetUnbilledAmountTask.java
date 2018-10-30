package executor;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class GetUnbilledAmountTask implements Callable<ProductAmount> {

	private String msisdn;

	public GetUnbilledAmountTask(String msisdn) {
		this.msisdn = msisdn;
	}

	public ProductAmount call() throws Exception {
		long t = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " Guncel Fatura Tutari Sorgulama Taski (GetUnbilledAmountTask) Basladi, " + msisdn
				+ " queue size :" + AsyncUtils.q1.size());

		ProductAmount productAmount = new ProductAmount();
		productAmount.setAmount(new BigDecimal(100));
		Thread.currentThread().sleep(100);
		return productAmount;
	}
}

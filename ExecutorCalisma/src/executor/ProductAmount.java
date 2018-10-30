package executor;

import java.math.BigDecimal;

public class ProductAmount {

	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ProductAmount [amount=" + amount + "]";
	}

}

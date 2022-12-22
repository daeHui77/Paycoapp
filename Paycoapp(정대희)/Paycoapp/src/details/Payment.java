package details;

import management.Money;
import management.Store;

public abstract class Payment {
    protected Money amount;

    public Payment(Money amount) {
        this.amount = amount;
    }

    public Money getAmount() {
        return this.amount;
    }

    public Money Amountpay(Money deposit) {
        this.amount = amount.plusamount(deposit);
        return this.amount;
    }

    public Money usePaymentAmount(Store store, Money price) {
        this.amount = amount.minus(price);
        return this.amount;
    }

}

package details;

import management.Money;
import management.Store;

public class Point extends Payment {
    private double percent;

    public Point(Money amount) {
        super(amount);
    }

    public void savePointsAmount(Store store, Money money) {
        this.amount = amount.plus(money.times(store.ratio()));
    }

    @Override
    public String toString() {
        return "포인트 결제";
    }
}
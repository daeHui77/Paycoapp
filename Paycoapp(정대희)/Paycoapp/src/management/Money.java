package management;

import java.math.BigDecimal;
//현금 관련 행동 메소드관리
public class Money {
    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public String toString() {
        return amount.toString() + "원";
    }

    public Money plusamount(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public boolean Tosmall(Money other) {
        return amount.compareTo(other.amount) < 0;
    }
}

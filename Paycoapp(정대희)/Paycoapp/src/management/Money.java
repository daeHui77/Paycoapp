package management;

import java.math.BigDecimal;
//���� ���� �ൿ �޼ҵ����
public class Money {
    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public String toString() {
        return amount.toString() + "��";
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

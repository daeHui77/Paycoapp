package details;

import management.Money;
//ī�� ���� ����
public class Card extends Payment {
    String creditName;

    public Card(Money amount, String creditName) {
        super(amount);
        this.creditName = creditName;
    }

    @Override
    public String toString() {
        return "ī�� ����\nī�� �̸�:" + this.creditName;
    }
}

package details;

import management.Money;
//카드 정보 관리
public class Card extends Payment {
    String creditName;

    public Card(Money amount, String creditName) {
        super(amount);
        this.creditName = creditName;
    }

    @Override
    public String toString() {
        return "카드 결제\n카드 이름:" + this.creditName;
    }
}

package details;

import management.Money;
//현금 정보 관리
public class Amonet extends Payment {
    public Amonet(Money amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "현금 결제";
    }
}

package details;

import management.Money;
//���� ���� ����
public class Amonet extends Payment {
    public Amonet(Money amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "���� ����";
    }
}

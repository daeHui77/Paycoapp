package Member;

import details.*;
import management.Money;
import management.Store;

public class Member {
    private Long cardid;
    private Card card;
    private Amonet Amonet;
    private Point point;
    private Payment selec;
    private Coupon coupon;
//프로젝트에 필요한 정보 저장 관리
    public Member(Long cardid, Card card, Amonet Amonet, Point point, Coupon coupon) {
        this.cardid = cardid;
        this.coupon = coupon;
        this.card = card;
        this.Amonet = Amonet;
        this.point = point;
    }

    public void pay(Store store, Money money) {
        selec.usePaymentAmount(store, money);
        point.savePointsAmount(store, money);
    }

    public Coupon useCoupon() {
        Coupon coupon = this.coupon;
        this.coupon = new Coupon(new NoneCoupon());
        return coupon;
    }

    public Long getcardid() {
        return cardid;
    }

    public Money getpoint() {
        return this.point.getAmount();
    }

    public Money getcard() {
        return this.card.getAmount();
    }

    public Money getAmonet() {
        return this.Amonet.getAmount();
    }

    public Payment getSelected() {
        return this.selec;
    }

    public void setSelected(Payment payment) {
        this.selec = payment;
    }

    public void deposit(Money price) {
        selec.Amountpay(price);
    }


}

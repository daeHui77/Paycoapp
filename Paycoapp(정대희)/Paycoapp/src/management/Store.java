package management;

import Member.Member;
import details.Card;
import details.Payment;
import details.Point;
import details.Amonet;
import details.Coupon;
import details.Coupon;

public class Store {
    private Product product;
    private double ratio;
    private String storeName;
    private Coupon coupon;
    private Long cardid;
    private Card card;
    private Amonet Amonet;
    private Point point;

    private Payment selec;

    Member member = new Member(cardid, card, Amonet, point, coupon);

    public Store(String storeName, Product product, double ratio) {
        this.storeName = storeName;
        this.product = product;
        this.ratio = ratio;

    }
//상품결제(쿠폰 및 영수증 제작)
    public sell selling(Member member) {
        //member
        Coupon coupon = member.useCoupon();
        Money price = calculatePrice(coupon);

        member.pay(this, price);

        return new sell(member, this, price);
    }

    private Money calculatePrice(Coupon coupon) {
        return product.calculateProductPrice(coupon);
    }

    public String getStoreName() {
        return storeName;
    }

    public Product getproduct() {
        return product;
    }

    public double getPercent() {
        return ratio;
    }

    public double ratio() {
        return ratio;
    }


}

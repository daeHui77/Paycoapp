package details;

import management.Money;
import management.Product;
//쿠폰 데이터 관리
public class Coupon {
    private TargetCoupon targetCoupon;

    public Coupon(TargetCoupon targetCoupon) {
        this.targetCoupon = targetCoupon;
    }

    public Money getDiscountPrice(Product product) {
        return targetCoupon.calculateDiscountAmount(product);
    }
}

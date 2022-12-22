package details;

import management.Product;
import management.Money;

import java.math.BigDecimal;

public class NoneCoupon implements TargetCoupon {
    public Money calculateDiscountAmount(Product product) {
        return new Money(BigDecimal.ZERO);
    }
}

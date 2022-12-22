package details;

import management.Product;
import management.Money;

public interface TargetCoupon {
    Money calculateDiscountAmount(Product product);
}

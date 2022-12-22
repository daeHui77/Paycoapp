package management;

import details.Coupon;

public class Product {

    private String productname;
    private Money productprice;
//물건 정보 저장
    public Product(String productname, Money productprice) {
        this.productname = productname;
        this.productprice = productprice;
    }

    public Money calculateProductPrice(Coupon coupon) {

        return productprice.minus(coupon.getDiscountPrice(this));
    }

    public String getName() {
        return productname;
    }

    public Money getPrice() {
        return productprice;
    }

    public String toString() {
        return "상품 이름: " + productname;
    }
}

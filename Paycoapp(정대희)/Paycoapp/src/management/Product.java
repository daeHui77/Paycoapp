package management;

import details.Coupon;

public class Product {

    private String productname;
    private Money productprice;
//���� ���� ����
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
        return "��ǰ �̸�: " + productname;
    }
}

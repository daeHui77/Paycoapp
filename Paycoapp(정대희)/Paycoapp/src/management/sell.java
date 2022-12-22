package management;

import Member.Member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sell {
    private Member member;
    private Money price;
    private Store store;
    private LocalDateTime currenttime;

    public sell(Member member, Store store, Money price) {
        this.member = member;
        this.price = price;
        this.store = store;
        this.currenttime = LocalDateTime.now();
    }
//영수증 제작
    public String toString() {
        return "판매일시: " + currenttime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n회원번호: "
                + member.getcardid() +
                "\n상품명: " + store.getproduct().getName() +
                "\n결제 수단: " + member.getSelected() +
                "\n결제 가격: " + price.toString() +
                "\n---------------------------------\n가맹점 정보\n" +
                "가게명: " + store.getStoreName() +
                "\n쿠폰 페이백 비율" + store.getPercent() +
                "\n";
    }
}

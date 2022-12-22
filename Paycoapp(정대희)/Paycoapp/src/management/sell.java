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
//������ ����
    public String toString() {
        return "�Ǹ��Ͻ�: " + currenttime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\nȸ����ȣ: "
                + member.getcardid() +
                "\n��ǰ��: " + store.getproduct().getName() +
                "\n���� ����: " + member.getSelected() +
                "\n���� ����: " + price.toString() +
                "\n---------------------------------\n������ ����\n" +
                "���Ը�: " + store.getStoreName() +
                "\n���� ���̹� ����" + store.getPercent() +
                "\n";
    }
}

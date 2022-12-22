import java.math.BigDecimal;
import java.util.Scanner;

import Member.Member;
import details.*;
import management.Money;
import management.Product;
import details.NoneCoupon;
import management.Store;
import management.sell;

public class Main {

    public static void main(String[] args) {

        int select1, select2, amount = 0, chargeamount = 0;

        Money money = new Money(new BigDecimal(0));

        Card card = new Card(money, "홍길동은행");

        Amonet amonet = new Amonet(money);

        Point point = new Point(money);

        Coupon coupon = new Coupon(new NoneCoupon());

        Member member = new Member(1L, card, amonet, point, coupon);

        Product procudt = new Product("황금올리브", new Money(new BigDecimal(30000)));
        Store store = new Store("BBQ", procudt, 0.5);
        System.out.println("컴퍼니 Payco에 오신걸 환영합니다.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("1: 충전하기 2:결제하기  3: 잔액 조회 4: 앱 종료");
            select1 = sc.nextInt();
            switch (select1) {
                case 1: {
                    System.out.println("충전 형태를 정하시오");
                    System.out.println("1: 카드 2: 포인트 3: 현금");
                    int n = sc.nextInt();
                    System.out.println("얼마나 하시겠습니까?");
                    chargeamount = sc.nextInt();
                    if (n == 1 && chargeamount > 0) {
                        member.setSelected(card);
                        member.deposit(new Money(new BigDecimal(chargeamount)));
                    } else if (n == 2 && chargeamount > 0) {
                        member.setSelected(point);
                        member.deposit(new Money(new BigDecimal(chargeamount)));
                    } else if (n == 3 && chargeamount > 0) {
                        member.setSelected(amonet);
                        member.deposit(new Money(new BigDecimal(chargeamount)));
                    } else {
                        System.out.println("다시 입력해주세요");
                        break;
                    }

                    break;
                }
                case 2: {
                    System.out.println("결제 수단을 선택하세요");
                    System.out.println("---------------------------------------");
                    System.out.println("카드 잔액: " + member.getcard() + "\n포인트 잔액: " + member.getpoint() + "\n현금 잔액: " + member.getAmonet());
                    System.out.println("---------------------------------------");
                    System.out.println("1: 카드 결제 2: 포인트 결제 3: 현금 결제");
                    select2 = sc.nextInt();
                    if (select2 == 1) {
                        member.setSelected(card);
                    } else if (select2 == 2) {
                        member.setSelected(point);
                    } else if (select2 == 3) {
                        member.setSelected(amonet);
                    }
                    if (member.getSelected().getAmount().Tosmall(store.getproduct().getPrice())) {
                        System.out.println("잔액부족");
                        break;
                    }
                    System.out.println("쿠폰 : 50프로 페이백입니다.");
                    sell sellInformation = store.selling(member);

                    System.out.println("---------------영수증----------------");
                    System.out.println(sellInformation.toString());
                    break;
                }
                case 3: {
                    System.out.println("잔액을 조회 합니다.");
                    System.out.println("카드 잔액: " + member.getcard() + "\n포인트 잔액: " + member.getpoint() + "\n현금 잔액: " + member.getAmonet());
                    break;
                }
                case 4: {
                    System.out.println("APP을 종료합니다.");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }

    }

}

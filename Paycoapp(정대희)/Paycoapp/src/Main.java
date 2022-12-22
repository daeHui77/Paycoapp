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

        Card card = new Card(money, "ȫ�浿����");

        Amonet amonet = new Amonet(money);

        Point point = new Point(money);

        Coupon coupon = new Coupon(new NoneCoupon());

        Member member = new Member(1L, card, amonet, point, coupon);

        Product procudt = new Product("Ȳ�ݿø���", new Money(new BigDecimal(30000)));
        Store store = new Store("BBQ", procudt, 0.5);
        System.out.println("���۴� Payco�� ���Ű� ȯ���մϴ�.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("1: �����ϱ� 2:�����ϱ�  3: �ܾ� ��ȸ 4: �� ����");
            select1 = sc.nextInt();
            switch (select1) {
                case 1: {
                    System.out.println("���� ���¸� ���Ͻÿ�");
                    System.out.println("1: ī�� 2: ����Ʈ 3: ����");
                    int n = sc.nextInt();
                    System.out.println("�󸶳� �Ͻðڽ��ϱ�?");
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
                        System.out.println("�ٽ� �Է����ּ���");
                        break;
                    }

                    break;
                }
                case 2: {
                    System.out.println("���� ������ �����ϼ���");
                    System.out.println("---------------------------------------");
                    System.out.println("ī�� �ܾ�: " + member.getcard() + "\n����Ʈ �ܾ�: " + member.getpoint() + "\n���� �ܾ�: " + member.getAmonet());
                    System.out.println("---------------------------------------");
                    System.out.println("1: ī�� ���� 2: ����Ʈ ���� 3: ���� ����");
                    select2 = sc.nextInt();
                    if (select2 == 1) {
                        member.setSelected(card);
                    } else if (select2 == 2) {
                        member.setSelected(point);
                    } else if (select2 == 3) {
                        member.setSelected(amonet);
                    }
                    if (member.getSelected().getAmount().Tosmall(store.getproduct().getPrice())) {
                        System.out.println("�ܾ׺���");
                        break;
                    }
                    System.out.println("���� : 50���� ���̹��Դϴ�.");
                    sell sellInformation = store.selling(member);

                    System.out.println("---------------������----------------");
                    System.out.println(sellInformation.toString());
                    break;
                }
                case 3: {
                    System.out.println("�ܾ��� ��ȸ �մϴ�.");
                    System.out.println("ī�� �ܾ�: " + member.getcard() + "\n����Ʈ �ܾ�: " + member.getpoint() + "\n���� �ܾ�: " + member.getAmonet());
                    break;
                }
                case 4: {
                    System.out.println("APP�� �����մϴ�.");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("�ٽ� �Է����ּ���");
                    break;
            }
        }

    }

}

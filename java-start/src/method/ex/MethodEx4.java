package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while(true) {

            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");

            System.out.print("선택: ");
            int num = input.nextInt();

            if (num == 1) {
                System.out.print("입금액을 입력하세요: ");
                //int amount = input.nextInt();
                //balance = deposit(balance, amount);
                balance = deposit(balance, input.nextInt());

            }
            else if (num == 2) {
                System.out.print("출금액을 입력하세요: ");
                //int amount = input.nextInt();
                //balance = withdraw(balance, amount);
                balance = withdraw(balance, input.nextInt());
            }
            else if (num == 3) {
                System.out.println("현재 잔액: " + balance);
            }
            else if (num == 4) {
                System.out.println("시스템을 종료합니다.");
                return;
            }

        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }

        balance -= amount;
        System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
}

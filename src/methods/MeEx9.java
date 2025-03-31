package methods;

public class MeEx9 {
    public static void main(String[] args) {
        int account = 10000;
        account = deposit(account, 1000);
        account = withdraw(account, 2000);

        System.out.println("최종 잔액: " + account);
    }

    public static int deposit(int account, int money) {
        account = account + money;
        System.out.println(money + "를 입금하였습니다. 현재 잔액: " + account);
        return account;
    }

    public static int withdraw(int account, int money) {
        if (account - money >= 0) {
            account = account - money;
            System.out.println(money + "를 출금하였습니다. 현재 잔액: " + account);
        } else {
            System.out.println("출금할 수 없습니다.");
        }

        return account;
    }
}

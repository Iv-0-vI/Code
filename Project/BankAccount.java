package Project;
/*
 存钱
 取钱
 显示
 结束
 */
class CheckingAccount {
    private double totalMoney;

    public CheckingAccount(double money) {
        this.totalMoney = money;
    }

    public void deposit(double money) {
        this.totalMoney += money;
        System.out.println("正在存钱" + money + "元");
        System.out.println("现在的余额为:" + totalMoney);
    }

    public void withdraw(double money) {
        this.totalMoney -= money;
        System.out.println("正在取钱" + money + "元");
        System.out.println("现在的余额为:" + totalMoney);
    }

    public double getTotalMoney() {
        return totalMoney;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        CheckingAccount lzk = new CheckingAccount(800.00);
        //初始化lzk有多少钱
        
        lzk.deposit(300.00);
        lzk.withdraw(1000);
        System.out.println("最终余额为"+lzk.getTotalMoney()+"元");
    }
}

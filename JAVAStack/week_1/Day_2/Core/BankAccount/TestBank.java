public class TestBank {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();
    account1.depositSaving(1000);
    account2.depositChecking(700);
    account3.depositChecking(300);
    account1.withdrawSaving(350);
    account2.withdrawSaving(200);
    account3.withdrawSaving(100);
    account1.withdrawChecking(300);
    account2.withdrawChecking(150);
    account3.withdrawChecking(160);
    System.out.println(BankAccount.getAccounts());
    System.out.println(BankAccount.getTotalMoney());
    

    }
    
}

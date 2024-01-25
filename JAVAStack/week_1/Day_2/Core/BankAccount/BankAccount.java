public class BankAccount{

    // MEMBRES VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; 
    // Constructor
    public BankAccount(){};


    public BankAccount( double checkingBalance, double savingsBalance){
        this.checkingBalance = 0.0;
		this. savingsBalance = 0.0;
        accounts++;
    
    }
    // Methods
    public void depositChecking( double prices){
        this.setCheckingBalance(this.getCheckingBalance()+prices);
        totalMoney += prices;
    }
    public void depositSaving(double pricess){
        this.setSavingsBalance(this.getSavingsBalance()+pricess);
        totalMoney += pricess;
    }

    public void withdrawSaving( double amount){
        if (amount< getSavingsBalance()){
            setSavingsBalance(getSavingsBalance()-amount);
            totalMoney-= amount;
        }
        else{
            System.out.println("insufficient funds");
        }
    }
    public void withdrawChecking( double amount){
        if (amount< getCheckingBalance()){
            setCheckingBalance(getCheckingBalance()-amount);
            totalMoney-= amount;
        }
        else{
            System.out.println("insufficient funds");
        }
    }

    public void getBalance(){
        System.out.println("balance is" + this.checkingBalance);
        System.out.println("balance"+ this.savingsBalance);
    
    }

    // Getters and Setters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void setCheckingBalance( double checkingBalance){
        this.checkingBalance= checkingBalance;
    }



    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void setSavingsBalance( double savingsBalance){
        this.savingsBalance= savingsBalance;
    }

    public static int getAccounts(){
        return BankAccount.accounts;
    }
    public static void setAccounts(int accounts){
            BankAccount.accounts=accounts;

    }


    public static double getTotalMoney(){
        return BankAccount.totalMoney;
    }
    public static void setTotalMoney(double totalMoney){
            BankAccount.totalMoney=totalMoney;

    }






}
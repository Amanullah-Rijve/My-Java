class BankAccount{
    int accountNUmber;
    String holderName;
    double balance;

    BankAccount(){
        this.accountNUmber = 0;
        this.holderName = "Unknown";
        this.balance = 0.00d;
    }

    BankAccount(int accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    BankAccount(int accountNUmber,String holderName,double balance){
        this.accountNUmber=accountNUmber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void displayAcount(){
        System.out.println("Account No: " + this.accountNUmber);
        System.out.println("Name: " + this.holderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("----------------------");
    }

    public void deposite(double amount){
        if(amount<=0){
            System.out.println("Invalide deposite amount");
            return;
        }
        balance = balance+amount;
        System.out.println("Deposite: "+ amount);
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalide withdraw amount");
            return;
        }
        if(amount>balance){
            System.out.println("Insuficiant balance");
            return;
        }
        balance = balance-amount;
        System.out.println("Withrawn: " +amount);
    }

}

public class Bank {
    public static void main(String[] args) {
        BankAccount c0 = new BankAccount();
        BankAccount c1= new BankAccount(1, "Shfik");
        BankAccount c2= new BankAccount(2, "Rafiq", 4900.69);
        
        c1.deposite(1500);
        c1.withdraw(300);

        c2.withdraw(6000);
        c2.deposite(2000);

        c0.displayAcount();
        c1.displayAcount();
        c2.displayAcount();

    }
}

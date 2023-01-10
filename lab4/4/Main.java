import java.util.Scanner;

// main method
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();
        while(true){


            System.out.println("Enter your choice");
            System.out.println("1. Deposit amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");


            int choice = sc.nextInt();


            if(choice == 1){
                System.out.println("Enter amount ");
                int amount = sc.nextInt();
                sa.deposit(amount);
            }
            else if(choice == 2)
            {
                System.out.println("Enter amount ");
                int amount = sc.nextInt();

                // try catch for balance not sufficient

                try {
                    sa.withdraw(amount);
                }catch (BalanceNotSufficient bns){
                    System.out.println("Exception caught " + bns.getMessage());
                }
            }
            else if(choice == 3)
            {
                System.out.println("Amount in the Account " + sa.getBalance());
            }else
            {
                break;
            }

        }
    }
}

// interface
interface Account {
    void deposit(int amount);
    void withdraw(int amount) throws BalanceNotSufficient;
}

// saving account class
class SavingsAccount implements Account{
    private int balance ;
    SavingsAccount(int balance){
        this.balance = balance;
    }
    SavingsAccount(){
        this.balance = 0;
    }
    // overriding methods
    @Override
    public void deposit(int amount) {
        System.out.println("Depositing Balance " + amount);
        balance += amount;
    }

    @Override
    public void withdraw(int amount) throws BalanceNotSufficient{
        System.out.println("Withdrawing amount " + amount);
        if(amount > balance) {
            throw new BalanceNotSufficient("Balance not Sufficient");
        }else{
            balance -= amount;
        }
    }
    int getBalance(){
        return balance;
    }
}


// creating exception class
class BalanceNotSufficient extends Exception{
    BalanceNotSufficient(String s){
        super(s);
    }
}

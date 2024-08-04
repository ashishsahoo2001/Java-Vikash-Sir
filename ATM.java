import java.util.Scanner;

class ATM {
    int pin = 7071;
    float Balance;
Scanner Sc = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your Pin");
        
        int PIN = Sc.nextInt();
        if (PIN == pin) {
            menu();
        }
        else {
            System.out.println("You entered wrong pin");
        }
    }

    public void menu() {

        System.out.println("1.Check Balance ");
        System.out.println("2.Deposite Money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
       
        int choice = Sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            depositeMoney();

        } else if (choice == 3) {
            withdrawMoney();
        } else if (choice == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice ");
        }
    }

    public void checkBalance() {
        System.out.println("Balance" + Balance);
        menu();
    }

    void depositeMoney() {
      
        System.out.println("Enter the amount");
        
        int amount = Sc.nextInt();
        Balance =Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount");
        
        int amount = Sc.nextInt();

        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Withdrawl Successfully");

        }
        menu();
    }
        public static void main(String[] args) {
            ATM a1 = new ATM();
            a1.checkPin();
        }
    }




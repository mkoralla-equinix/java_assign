import java.util.*;
class Bank
{
    private int balance; //to store balance
    private Long account_number; //to store account number
    String name;// to store account holder name
    String account_type;// to store account type
    Scanner sc=new Scanner(System.in);
    // Scanner object is created to take inputs
    // to initialize the balance with default 0

    void initial_balance()
    {
        balance=0;
    }
    // to initialize the balance with given amount
    void initial_balance(int amount)
    {
        balance=amount;
    }
    // to enter the details about the account
    public void openAccount()
    {
        System.out.println("Enter the account holder name");
        name=sc.nextLine();
        System.out.println("Enter account type");
        account_type=sc.nextLine();
        System.out.println("Enter the account number");
        account_number=sc.nextLong();

    }
    // to display the account detials
    public void showAccountDetails()
    {
        System.out.println("Account Holder name: "+name);
        System.out.println("Account number: "+account_number);
        System.out.println("Account type: "+account_type);
        System.out.println("Current balance: "+balance);
    }
    // to add amount to account
    void Deposit()
    {
        try
        {
            System.out.println("Enter the amount to deposit");
            int amount=sc.nextInt();
            balance=balance+amount;
            System.out.println("Current balance is "+balance);
        }
        catch(Exception e)
        {
            System.out.println("Enter correct input");
        }
    }
    // to display the loan interest rates
    void LoanInterest()
    {
        System.out.println("Normal interest rate is 7.4");
    }
    void LoanInterest(String a)
    {
        System.out.println("House Interest rate is 9.6");
    }
    // to withdraw the amount
    void WithDraw()
    {
        try
        {
            System.out.println("Enter the amount to withdraw");
            int amount=sc.nextInt();
            if(amount<=balance && amount>0)
            {
                balance=balance-amount;
                System.out.println("Current balance is "+balance);
            }
            else if(amount<=0)
            {
                System.out.println("Enter valid amount");
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }

    }
    // to display the balance
    void Balance_enquiry()
    {
        System.out.println("Current balance is "+balance);
    }
}
class SBI extends Bank
{
    // display the interest rate of SBI bank
    void LoanInterest()
    {
        System.out.println("The interest rate in SBI is 10.9");
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice to select the bank");
        System.out.println("1. Reserve Bank");
        System.out.println("2.SBI");
        try {
            int choice = sc.nextInt();
            if (choice == 1) {
                Bank bank = new Bank();
                System.out.println("Enter the initial deposit if any");
                int initial_amount = sc.nextInt();
                if (initial_amount > 0) {
                    bank.initial_balance(initial_amount);
                } else {
                    bank.initial_balance();
                }
                System.out.println("Enter your account details");
                bank.openAccount();
                while (true) {
                    System.out.println("Select the operation");
                    System.out.println("1.Display account details\n2.Deposit\n3.Withdraw\n4.Balance enquiry\n5.Loan interest rate\n6.End");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1:
                            bank.showAccountDetails();
                            break;
                        case 2:
                            bank.Deposit();
                            break;
                        case 3:
                            bank.WithDraw();
                            break;
                        case 4:
                            bank.Balance_enquiry();
                            break;
                        case 5:
                            bank.LoanInterest();
                            bank.LoanInterest("house");
                            break;
                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Enter correct choice");
                            break;
                    }
                }
            } else if (choice == 2) {
                SBI sbi = new SBI();
                System.out.println("Enter the initial deposit if any");
                int initial_amount = sc.nextInt();
                if (initial_amount > 0) {
                    sbi.initial_balance(initial_amount);
                } else {
                    sbi.initial_balance();
                }
                System.out.println("Enter your account details");
                sbi.openAccount();
                while (true) {
                    System.out.println("Select the operation");
                    System.out.println("1.Display account details\n2.Deposit\n3.Withdraw\n4.Balance enquiry\n5.Loan interest rate\n6.End");
                    int c = sc.nextInt();
                    switch (c) {
                        case 1:
                            sbi.showAccountDetails();
                            break;
                        case 2:
                            sbi.Deposit();
                            break;
                        case 3:
                            sbi.WithDraw();
                            break;
                        case 4:
                            sbi.Balance_enquiry();
                            break;
                        case 5:
                            sbi.LoanInterest();
                            break;
                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Enter correct choice");
                            break;
                    }
                }
            }
            else
            {
                System.out.println("Enter correct choice");
            }
        }
        catch (Exception e) {
            System.out.println("Enter correct input");
        }
    }
}

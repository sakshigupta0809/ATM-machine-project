import java.util.*;
class ATM{
    float balance ;
    int pin = 1234;
    public  void checkPin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!");
        System.out.println("Enter your PIN");
        int enterPin = sc.nextInt();
        if(enterPin==pin) {
            menu();
        } else {
            System.out.println("Please enter correct pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");

        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1) {
            checkBalance();
        } else if(choice == 2) {
            withdraw();
        } else if(choice == 3) deposit();

        else if(choice == 4){
            System.out.println(" Please Collect your card");
            System.out.println("Thank you for using the ATM Machine ");
            return;
        }
        else {
            System.out.println("Enter wrong choice");
        }
    }
//    to check balance
    public void checkBalance(){
        System.out.print("Your balance is : " );
        System.out.println(balance);
         menu();

    }
    // to withdraw money
    public void withdraw(){
        System.out.println("Enter Amount to withdraw");
        Scanner sc =  new Scanner(System.in);
        float amount = sc.nextInt();
        if(balance<=0){
            System.out.println("Your account is null");
            System.out.println("please firstly deposit appropriate amount to withdraw");
        }
        else if(amount>balance) {
            System.out.println("Insufficient balance");
        } else{
            balance -= amount;
            System.out.println("Amount withdraw successfully : " + amount);
            System.out.println("Your remaning amount is :" + balance);
        }
        menu();
    }
    // to deposit money
    public void deposit(){
        System.out.println("Enter amount to deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        balance += amount;
        System.out.println("Amount deposit successfully : " + balance);
        //we reach to the menu option
        menu();
    }
}
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
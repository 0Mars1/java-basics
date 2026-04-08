import java.util.Scanner;
class AccountManager{
    float cBalance;
    AccountManager(){
        cBalance = 0;
    }
    void checkBalance(){
        System.out.println("Your Current Balance is "+ cBalance);
    }
    void withdraw(float amount){
        if(cBalance >= amount){
            cBalance = cBalance - amount;
            checkBalance();
        }else{
            System.out.println("inseficent balance");
        }

    }

    void deposit(float amount){
        cBalance = cBalance + amount;
        checkBalance();
    }
}
public class ATMManager{
  public static void main(String[] args){
      AccountManager am = new AccountManager();
    Scanner sc = new Scanner(System.in);
    int option;
    float amount;
    System.out.println("Enter 1 for deposit");
    System.out.println("Enter 2 for withdraw");
    System.out.println("Enter 3 for check Balance");
   option = sc.nextInt();
    if(option == 1){
        System.out.println("Enter Amount to depost");
        amount = sc.nextFloat();
        am.deposit(amount);
    }else if(option == 2){
        System.out.println("Enter Amount to withdraw");
        amount = sc.nextFloat();
        am.withdraw(amount);
    }else if(option == 3){
        am.checkBalance();
    }
  }
}
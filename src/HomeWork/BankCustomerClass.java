package HomeWork;

public class BankCustomerClass{


String name = "";
String ssn = "";
int accountNumber = 0;
int [] countAccountNumber = new int [accountNumber];

public BankCustomerClass (String name, String ssn, boolean savingsAccount, Double initialAmount){
    this.name = name;
    this.ssn = ssn;
    BankAccountClass b1 = new BankAccountClass(savingsAccount,initialAmount);
    if (initialAmount >= 1000){
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Holder ssn: " + ssn);
        accountNumber= BankAccountClass.accountNumber++;
        System.out.println("Account Number is: " + accountNumber);
    } else{
        System.out.println("Unable to process your account opening, please try again");
    }

    }

    public void getMiniStatement (String ssn){
    if (this.ssn.equals(ssn)){


    }
    }


}





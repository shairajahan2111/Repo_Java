package HomeWork;

public class BankAccountClass {

    boolean savingsAccount = true;
    double initialAmount = 0;
    static int accountNumber = 1000;
    int maxAccountForACustomer = 5;

    //Accounts [] allAccounts = new [maxAccountForACustomer];
    static int startingAccountNumber = 1000;
    int[] allAccountNumbers = new int[maxAccountForACustomer];
    double[] balance = new double[maxAccountForACustomer];
    int accountCount = -1;


    public BankAccountClass (boolean savingsAccount, double initialAmount ) {

                if (savingsAccount && initialAmount >= 1000) {
                    System.out.println("Created a savings account with initial deposit of: " + initialAmount);

                } else if (!savingsAccount && initialAmount >= 1000){
                    System.out.println("Created a checking account with initial deposit of: " + initialAmount);
                } else if ((savingsAccount || !savingsAccount) && initialAmount < 1000){
                    System.out.println("Initial amount should be minimum $1,000.00 to open a bank account, your amount is: $" + initialAmount);
                }
    }




    }








package test;

import java.util.Random;

public class BankUtility {
    String ACCOUNT_NAME;
    protected double ACCOUNT_BALANCE;
    int ACCOUNT_NUMBER;
    /**
     * The current version of this class
     */
    static String APP_VERSION = "5.4.7";
    static String API_AUTHOR = "Stanley";
    
    public BankUtility(String name){    
        this.ACCOUNT_NAME = name;
        this.ACCOUNT_BALANCE = 0;
        this.ACCOUNT_NUMBER = generateAccountNumber();
        printSummary();
    }
    
    private int generateAccountNumber(){
        Random r = new Random();
        int ac = r.nextInt(1000000000);
        return ac;
    }
    public void printSummary(){
        
        System.out.println(String.format("ACCOUNT NAME: %s\nACCOUNT NUMBER: %s\nACCOUNT BALANCE: %s\n", this.ACCOUNT_NAME,this.ACCOUNT_NUMBER,this.ACCOUNT_BALANCE));
    }
    /**
     * Call this method whenever you want to add an amount to the client account balance
     * The amount parameter must be a double
     * @param amount 
     */
    public void makeDeposit(double amount){
        this.ACCOUNT_BALANCE += amount;
        System.out.println("Deposit Successfull");
    }
    public void withdraw(double amount){
        if(amount > this.ACCOUNT_BALANCE){
            System.out.println("Insufficent funds");
        }else{
            this.ACCOUNT_BALANCE -= amount;
            System.out.println("Withdraw Successfull");
        }
    }
    public void getInterestRate(){
        double interestRate = (5.0/100)* this.ACCOUNT_BALANCE;
        System.out.println("Your interest is "+interestRate);
    }
}

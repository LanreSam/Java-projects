
package test;

public class MicrofinanceUtility extends BankUtility {
    
    public MicrofinanceUtility(String name){
        super(name);
        
    }
    @Override
    public void getInterestRate(){
        double interestRate = (10.0/100)* this.ACCOUNT_BALANCE;
        System.out.println("Your interest is "+interestRate);
    }
}

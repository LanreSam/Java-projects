/**
 * THIS IS A GUESS GAME CREATED BY STANLEY
 */
package guessgame;

import test.BankUtility;
import test.MicrofinanceUtility;




public class GuessGame {

    public static void main(String[] args) {
        //String time = new SimpleDateFormat().format(new Date());
        //System.out.println(time);
        
        /*Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a \nEEEE MMMM dd");
        String hour = sdf.format(d);
        System.out.println(hour);*/
        
        
        /*BankUtility j = new BankUtility("John");
        BankUtility s = new BankUtility("Stanley");
        
        
        j.makeDeposit(5000);
        s.makeDeposit(500);
        
        j.printSummary();
        s.printSummary();
        
        j.withdraw(3000);
        s.withdraw(3000);
        
        j.getInterestRate();
        s.getInterestRate();
        
        j.printSummary();
        s.printSummary();
        */
        BankUtility j = new BankUtility("sam");
        MicrofinanceUtility c = new MicrofinanceUtility("Collins");
        j.makeDeposit(400);
        c.makeDeposit(400);
        j.getInterestRate();
        c.getInterestRate();
        

    }

}

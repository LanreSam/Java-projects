
package simpleinterestcalc;

import java.util.Scanner;

public class SimpleInterestCalc {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        double p,i,r,t,c;
        System.out.print("This is a program that calculates simple interest. ");
        System.out.println("");
        System.out.print("How much do you want to invest with us?: ");
        p = user.nextDouble();
        System.out.print("Enter your interest rate(%): ");
        r = user.nextDouble();
        System.out.print("How many years do you want to invest?: ");
        t = user.nextDouble();
        i = (p*r*t)/100;
        c = i+p;
        System.out.println("Your interest for investing with us for "+t+"year(s) is "+i);
        System.out.println("");
        System.out.println("Therefore your investment has risen by #"+i+" and your new capital is "+c);
        System.out.println("Thanks for investing with us.....................");
    }
}

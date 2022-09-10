package com.blz.QuotientRemainder;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
System.out.println("Welcome to Compute Quotient & Remainder Program!!");
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter dividend: ");
   int dividend = scanner.nextInt();
   
   System.out.println("Enter divisor: ");
   int divisor = scanner.nextInt();
   
   int Quotient = dividend/divisor;
   int Remainder = dividend % divisor;
   
   System.out.println("The Quotient is: "+Quotient);
   System.out.println("The Remainder is: "+Remainder);
             




	}

}

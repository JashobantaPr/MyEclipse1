package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values:");
		String org =sc.nextLine();
        String rev="";
        int length =org.length();
        for(int i=length-1;i>=0;i--) {
        	rev=org.charAt(i)+rev;
        }
        if(org.equals(rev))
        {
        	System.out.println("Entered value is a palindrome:");
        }
        else {
        	System.out.println("Entered value is not a palindrome:");
        }
	}

}

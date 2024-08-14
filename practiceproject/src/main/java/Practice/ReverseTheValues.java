package Practice;

import java.util.Scanner;

public class ReverseTheValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the values");
     String b= sc.nextLine();
     String rev="";
    String s[]=b.split("");
    
    for(int i=0;i<s.length;i++) {
    	rev=s[i]+""+rev;
    }
    System.out.println(rev);
	}

}

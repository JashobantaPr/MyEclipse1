package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value :");
		int count=sc.nextInt();
		int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}

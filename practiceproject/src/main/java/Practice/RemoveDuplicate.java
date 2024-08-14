package Practice;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values :");
  String a=sc.next();
  
  char arr[]=a.toCharArray();
  for(int i=0;i<a.length();i++)
  {
	  int count=0;
	  for(int j=i+1;j<a.length();j++) {
		  if(arr[i]==arr[j]) {
			  count++;
			  arr[j]=' ';
		  }
	  }
	  if(count>=2) {
		  System.out.println(arr[i]);
	  }
  }
	}

}

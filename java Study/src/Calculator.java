import java.util.Scanner;

public class Calculator {
		public static int add(int a, int b){
			return a+b;
		}
		public static int sub(int a, int b){
			return a-b;
		}
		public static int multi(int a, int b){
			return a*b;
		}
		public static int div(int a, int b){
			return a/b;
		}
		public static int mod(int a, int b){
			return a%b;
		}
		public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of a");
			int a = sc.nextInt();
			System.out.println("enter value of b");
			int b = sc.nextInt();
			Calculator c=new Calculator();
			c.div(a, b);
			System.out.println(a/b);
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a%b);
		}
	
}

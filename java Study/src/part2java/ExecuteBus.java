package part2java;

public class ExecuteBus {
	public static void book(Bus ob)
	{
		ob.Features();
		if(ob instanceof AcSleeperBus)
		{
			AcSleeperBus c=(AcSleeperBus)ob;
			c.cost();
		}
		else
		{
			SemiSleeperBus w=(SemiSleeperBus)ob;
			w.Features();
		}
	}
	public static void main(String[] args) 
{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your booking option 1AcSleeper  2Semisleeper");
		int n=s.nextint();
		if(n==1)
		{
		AcSleeperBus a=new AcSleeperBus();
		book(a);
		
	}
		else if(n==2)
		{
			SemiSleeperBus b=new SemiSleeperBus();
			book(b);
		}
		else
		{
			System.out.println("invalid option");
		}
	
}
}

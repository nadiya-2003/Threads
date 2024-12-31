class Demo extends Thread 
{ 
	public void run()
	{
	 for(int i=0;i<5;i++)
	{
		System.out.println("Nadiya");
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
	}
	}
	}
	}
public class DemoThread {
	public static void main(String[] args) throws InterruptedException
	{
		Demo d=new Demo();
		System.out.println("Printing Operation Started");
		d.start();
	}

}

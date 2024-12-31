import java.util.InputMismatchException;
import java.util.Scanner;
class Operations extends Thread
{
public void run()

	{
		if(Thread.currentThread().getName().equals("add"))
		{
			add();
		}
		else if (Thread.currentThread().getName().equals("print"))
		{
			print();
		}
		else
		{
			bank();
		}
	}
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		try
		{
			
			System.out.println("Task 1:Addition operation started");
			System.out.println("Enter the first number:");
			int num1=sc.nextInt();
			System.out.println("Enter the second number:");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("Result is:"+res);
			System.out.println("Additon operation completed");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(InputMismatchException e1)
		{
			e1.printStackTrace();
		}
	}
	public void print()
	{
		try 
		{
		for(int i=0;i<5;i++)
			{
			System.out.println("Nadiya");
		
				Thread.sleep(4000);
			}
		}
			
		catch (InterruptedException e)
			{
				e.printStackTrace();
		    }	
	}
		public void bank() 
		{
			try
			{
			System.out.println("Task3:Banking operation started");
			System.out.println("Enter the Account number:");
			int acc=sc.nextInt();
			System.out.println("Enter pin code:");
			int pin=sc.nextInt();
			System.out.println("Account details recorded");
			System.out.println("Task 3:Banking operation completed");
			}
			catch(ArithmeticException e1)
			{
				   e1.printStackTrace();
			}
			catch(InputMismatchException e2)
			{
				e2.printStackTrace();
			}
		}
}
public class MultiThreadedProgram {
	public static void main(String[] args)throws InterruptedException
	{
		Operations op1=new Operations();
		Operations op2=new Operations();
		Operations op3=new Operations();

		op1.setName("add");
		op2.setName("print");
		op3.setName("bank");
		op1.start();
		op2.start();
		op3.start();
	}
}
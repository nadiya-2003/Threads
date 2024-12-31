
import java.util.InputMismatchException;
	import java.util.Scanner;
	class Opp implements Runnable
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
	public class MultiThreadedProgram1 {
		public static void main(String[] args)throws InterruptedException
		{
			Opp op1=new Opp();
			Opp op2=new Opp();
			Opp op3=new Opp();
			
			Thread t1=new Thread(op1);
			Thread t2=new Thread(op2);
			Thread t3=new Thread(op3);


	t1.setName("add");
	t2.setName("print");
	t3.setName("bank");
	
	
			t1.start();
			t2.start();
			t3.start();
		}
	}



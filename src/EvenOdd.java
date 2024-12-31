
public class EvenOdd extends Thread {
	public void run()
	{
		if(Thread.currentThread().getName().equals("Even"))
		{
			try {
				num();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				num1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
		
		void num() throws InterruptedException
		{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even:"+i);
			}
			Thread.sleep(2000);
		}
		
		}
		
		void num1() throws InterruptedException
		{
		 for(int i=1;i<=10;i++)
			{
			 if(i%2!=0)
			 {
				System.out.println("Odd:"+i);
		}
			 Thread.sleep(2000);
		}
		}
		
	
		
       
	
}

	



class Producer extends Thread
{
	Queue a;
	public Producer(Queue q)
	{
		a=q;
	}

@Override
public void run()
{
	int i=1;
	while(true)
	{
		a.put(i);
		i++;
	}
	}
}
class Consumer extends Thread
{
	Queue b;
	public Consumer(Queue q)
	{
		b=q;
	}
	@Override
	
	public void run() {
		int i=1;
		while(true)
		{
			b.get(i);
			i++;
		}
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue();
(new Producer(q)).start();
(new Consumer(q)).start();
	}

}

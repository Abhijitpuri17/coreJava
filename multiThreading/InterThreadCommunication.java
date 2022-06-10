package multiThreading;

public class InterThreadCommunication 
{

	public static void main(String[] args) 
	{
		MyData data = new MyData();
		Producer producer = new Producer(data) ;
		Consumer consumer = new Consumer(data) ;
		
		producer.start();
		consumer.start();
 
	}

}

class MyData
{
	int value ;
	boolean flag = true ;    // true = producer's turn else consumer's turn
	
	synchronized public void set(int v)
	{
		while(!flag)
			try {wait();} catch (InterruptedException e) {	e.printStackTrace();}
		value = v ;
		flag = false ;
		notify();
	}
	
	synchronized public int get()
	{
		while(flag)
			try {wait();} catch (InterruptedException e) {	e.printStackTrace();}
		int x = value;
		flag = true;
		notify();
		return x ;
	}	
}

class Producer extends Thread
{
	MyData d;
	
	public Producer(MyData d) {
		this.d = d ;
	}
	
	@Override
	public void run() 
	{
	   int count = 1 ;
	   while (true)
	   {
		   d.set(count++);
		   System.out.println("Producer : " + (count-1));
		   System.out.flush();
	   }
		
	}
}

class Consumer extends Thread
{
	MyData d;
	
	public Consumer(MyData d) {
		this.d = d ;
	}
	
	@Override
	public void run() 
	{
	   int val = 0 ;
	   while (true)
	   {
		   val = d.get();
		   System.out.println("Consumer : " + val);
		   System.out.flush();
	   }
		
	}
}

















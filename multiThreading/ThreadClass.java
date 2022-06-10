package multiThreading;

public class ThreadClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		// CONSTRUCTORS 
		//1
		Thread t =  new MyClass() ;
		Thread t2 = new Thread("myThread2");
		
		// 2 -> with parameter = Runnable r , 3 -> with parameters = Runnable r , String name ,
		//4 -> parameters = ThreadGroup tg

		// get and set METHODS
		long id1 = t.getId();
		long id2 = t2.getId();
		
		t.setName("myThread1");
		String name1 = t.getName();
		String name2 = t2.getName();
		
		t.setPriority(10);
		int priority1 = t.getPriority();
		int priority2 = t2.getPriority();
	
		Thread.State ts = t.getState();

		System.out.println(id1 + " " + id2 + " " + name1 + " " + name2 + " " + priority1 + " " + priority2
				+ " " + ts);
		
		//t.start();
		System.out.println(t.isAlive());

		// Instance methods
		  t.interrupt();         // To interrupt current sleeping or waiting phase of thread
		  
		  t.join() ;             // If task in thread is terminated but we want it not to terminate 
		                         // e.g. main thread termination causes app termination even though 
		                         // other threads may be still working
		  
		  t.start();          // start execution of task in thread

		 // Static methods
		  System.out.println(Thread.activeCount());
		  System.out.println(Thread.currentThread());
		  Thread.yield();       // Thread is ready to wait. Other thread will be given more time
		 // Thread.dumpStack();
		  

		// Daemon thread works in background and terminates when main thread is terminated
		

	}

}


 class MyClass extends Thread 
 {
	 
 }
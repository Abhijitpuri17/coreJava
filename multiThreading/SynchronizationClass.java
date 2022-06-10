package multiThreading;

public class SynchronizationClass 
{
	
	/*
	     1) Resource sharing : more than one thread may be accessing same resource
	     
	     2) Critical section : Part of codes in thread which access same resource
	     
	     3) Mutual exclusion : It is property of synchronization which states that "no two processes
	                can exist in critical section at any given point of time"
	                
	     4) Locking / mutex : It is a locking mechanism used to synchronize threads. A thread checks mutex
	            before using resource and if it is not locked, it starts using resource.
	            **DRAWBACK : A thread sees that mutex is not locked but at the same time slack of this thread
	               ends before locking mutex. Another thread starts using resource. Again when time slack of first thread
	               comes it doesn't check if mutex is locked or not and start using resource. So 2 threads are using it.
	                 
	     5) Semaphore : There are two methods wait() and signal(). If some thread is using resource and other thread
	          wants to use it, it will be added to Wait queue. Once the thread is done using resource, signal fun is
	          called and thread in front of wait queue will start using resource. It goes on.       
	 
	     ***
	     6) MONITOR : In java using shared object, it has read() and write() function. The object handles everything
	            about synchronization internally

	 */
	
	

	public static void main(String[] args) 
	{
		MyData1 d = new MyData1();
		Thread t1 = new MyThread1(d);
		Thread t2 = new MyThread2(d);
		t1.start();
		t2.start();
	}

}

  class MyData1
	{
		 synchronized void display(String str)
		  {   
			  for (int i = 0 ; i < str.length() ; i++) System.out.print(str.charAt(i));
			  System.out.println();  
		  }
	}


  class MyThread1 extends Thread
  {
	  MyData1 d ;
	  
	  public MyThread1(MyData1 d) {
		  this.d = d ;
	  }
	  public void run() {
		  d.display("Hello world. This is thread 1 for testing synchronization") ; 
	  }
  }

  class MyThread2 extends Thread
  {
	  public MyThread2(MyData1 d) {
		  this.d = d ;
	  }
	  MyData1 d = new MyData1();
	  public void run() {
		  d.display("Welcome to thread 2") ; 
	  }
  }

  


  
















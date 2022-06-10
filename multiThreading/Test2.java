package multiThreading;

	public class Test2 implements Runnable
	{
	
		@Override
		public void run() {
			for (int j = 1 ; j < 1001 ; j++) System.out.println("Hello  " + j + "  ") ;
		}

		public static void main(String[] args) 
		{
	          Test2 test2 = new Test2() ;
	          Thread t = new Thread(test2) ;
	          t.start() ;
	          
	          for (int i = 1 ; i < 1001 ; i++) System.out.println("World  " + i + "  ") ;
	
		}
	}
	
	
	

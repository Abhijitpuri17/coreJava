	package multiThreading;

	public class Test1 extends Thread
	{

		@Override
		public void run() {
			for (int j = 1 ; j < 1001 ; j++) System.out.println("Hello  " + j + "  ");
		}

		public static void main(String[] args)
		{
	          Test1 test1 = new Test1();
	          test1.start();

	          for (int i = 1 ; i < 1001 ; i++) System.out.println("World  " + i + "  ");
	
		}
	
	}

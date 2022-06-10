package oOPS.interfaces;


public class ChildClass implements MyInterface
	{
		@Override
		public void meth1() {
		    System.out.println("Meth 1 from child class");
			
		}

		@Override
		public void meth2() {
			System.out.println("Meth 2 from child class");
		}

	}

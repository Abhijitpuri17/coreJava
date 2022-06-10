package oOPS.interfaces;

public class Main {

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		c.meth1();
		c.meth2();

		MyInterface m = new ChildClass();
		m.meth1();
		m.meth2();

		MyInterface.meth3();

	}

}

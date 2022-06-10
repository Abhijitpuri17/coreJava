package oOPS.interfaces;


          /* 
              interfaces are also used to achieve abstraction/Run time polymorphism
              
              If we use abstract classes, a child class can extend from only one parent
              but child class can implement multiple interfaces
              
              All methods of interface are abstract
              Interface can have static methods with body also default methods with body.
              If we want to add some methods to interface then make them default else 
              all child class will become abstract
              
              Also interface can have private methods which can be used internally in interface
              as they cant be called outside interface
           */


	public interface MyInterface 
	{
		void meth1() ;
		void meth2() ;
		static void meth3() {
			System.out.println("Meth 3 from interface");
		}
	}

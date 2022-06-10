package generics;

public class Intro
{
	static class Data<T>
	{
		private T obj ;
		
		public void setData(T v)
		{
			obj = v ;
		}
		
		public T getData()
		{
			return obj ;
		}
		
	}
 
	public static void main(String[] args) 
	{
		Data<Integer> d = new Data<>() ;
		d.setData(10);
		System.out.println(d.getData());
		
		Data<String> d2 = new Data<>();
		d2.setData("Abhijit");
		System.out.println(d2.getData());
		
	}

}

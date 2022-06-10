package oOPS.singletons;

public class MainClass 
{
         public static void main(String [] args)
         {
        	 AppConfig obj = AppConfig.getInstance() ;       /// kitni baar bhi is tarike se AppConfig class
        	 AppConfig obj2 = AppConfig.getInstance() ;     /// ka object banao woh same object hoga joh
        	                                                 // hamne singleton pattern ke dwara banaya hai
         }
}                                                            /// memory bachegi

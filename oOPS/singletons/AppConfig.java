package oOPS.singletons;

public class AppConfig 
{
        private AppConfig()
        {
        	
        }
        
        private static AppConfig obj = null ;           /// variable of type AppConfig
                                                        /// null is liye , agar hamare app me is class ka 
                                                        /// object is never called to memory kyu waste kare
        
        public static AppConfig getInstance()
        {
        	if(obj == null) obj = new AppConfig() ;
        	return obj ;
        }
        
}

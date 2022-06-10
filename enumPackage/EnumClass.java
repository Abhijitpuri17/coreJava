package enumPackage;

public class EnumClass 
{
	
	// A new data-type which can have only specific values
	enum Branch{
		CSE, IT , ENTC , MECH , CIVIL
	}

	public static void main(String[] args) 
	{
		
		Branch b1 = Branch.CIVIL;
		Branch b2 = Branch.CSE;
		
		System.out.println(b1);
		
		Branch [] bArr = Branch.values();
		for (Branch b:bArr) System.out.println(b);
		
	}

}

package Week2.Day2;

public class ChangeOddIndextoUppercase {
	
	public static void main(String[] args)
	{
		String test = "changeme";
		char c[]=test.toCharArray();
		for (int i=0;i<c.length;i++)
		{
			
		if (i%2!=0)
		{
			//System.out.println(charArray[i]);
			 c[i]=Character.toUpperCase(c[i]);
			 System.out.print(c[i] );
			// System.out.println(charArray[i] );
		}
		else
			 System.out.print(c[i] );

	}

}

}
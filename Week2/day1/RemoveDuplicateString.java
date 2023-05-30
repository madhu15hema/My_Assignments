package Week2.day1;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1 We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");  // ctrl+2 , l
		for(int i=0;i<split.length;i++)
		{
		for(int j=i+1;j<split.length;j++)
		{
			if(split[i].equals(split[j]))
			{
				count++;
				if(count>0) {
					split[j]="";
					
					}
				
			}
		}
		
	}
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			System.out.print(string + " ");
		}
	}
}

	  
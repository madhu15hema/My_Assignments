package Week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		String test = "I am a software tester"; 
		String output="";
		   String[] words = test.split(" ");
		   for (int i = 0; i < words.length; i++) {
			 if(i%2!=0) {
				char[] evenword = words[i].toCharArray();
				String reversedWord ="";
				for (int j = evenword.length-1; j >=0; j--) {
					reversedWord = reversedWord + evenword[j];
				}
				output = output + reversedWord + " ";
			 }else {
				 output = output + words[i] + " ";
			 }
		}
		   System.out.println(output);
	}

}
	

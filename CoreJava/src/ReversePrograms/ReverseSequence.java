package ReversePrograms;

public class ReverseSequence {

	public static void main(String[] args) {
		String input = "My name is Radha";
		String[] words=input.split(" ");
		StringBuffer reversed=new StringBuffer();
		for(int i= words.length-1; i>=0; i--)
		
			reversed.append(words[i]).append(" ");
		
		System.out.println("Reversed Sequence: " + reversed.toString().trim());		
		
	}

}


//Input ="My name is Radha"
//Output ="Radha is name My"
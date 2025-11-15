package ReversePrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String str = " Programming language ";
		String[]words=str.split(" ");
		String rev = " ";
		for(String word : words ) {
			String reversedword="";
			
				for(int i=word.length()-1 ; i>=0; i--) {
					reversedword=reversedword+word.charAt(i);
				}
					
			rev=rev+reversedword+ " ";
			
		}
		System.out.println("Reverse String is : "+ rev.trim());
	}

}
//Input : Programming Language 
//Output : gnimmaragorP egaugnaL


package ReversePrograms;

public class PartialReverse {

	public static void main(String[] args) {
		
		String str ="I am Automation Tester";
		String target="Automation";
		String reversed ="";
		int len=target.length();
		for(int i=len-1; i>=0; i--)
		{
			reversed=reversed+target.charAt(i);
		}
		String result =str.replace(target, reversed);
		System.out.println(result);
	}


}


//Input : I am Automation Tester
//Output : I am noitamotuA Tester

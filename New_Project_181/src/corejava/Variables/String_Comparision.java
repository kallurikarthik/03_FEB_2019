package corejava.Variables;

public class String_Comparision 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		=> String is a non primitive datatype and also called as CLASS.
		 * 		   Because String class contains set of events[Methods] to 
		 * 			validate stored characters.
		 */
		
		
		/*
		 * equals:-->
		 * 		Method verify equal comparision between two strings and return
		 * 		boolean value.Equal comparision is casesensitive.
		 */
	
		String Exp_res="Account Created";
		String Act_res="account created";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is => "+flag);
		
		/*
		 * equalIgnorecase:-->
		 * 		Method verify equal comparision between two strings by ignoring
		 * 		casesensitive and return boolean value true/false.
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIngorecae comparision is => "+flag1);
		
		/*
		 * Contains:-->
		 * 		Method verify any partial characters available at main string.
		 * 		And method is a boolean type return true/false.
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("created successfull");
		System.out.println("partial sequence status is => "+flag2);
		
		
		/*
		 * subString:-->
		 * 			Method get sub String characters from main String.
		 * 			And return value is String.
		 */
		String Account_Num="1234567822226468";
		String Last_Digits=Account_Num.substring(12);
		System.out.println("Account number last 4 digits are => "+Last_Digits);
		
		String Middle_digits=Account_Num.substring(8, 12);
		System.out.println("Account number middle digits are => "+Middle_digits);
		
		/*
		 * length:-->
		 * 			Method count set of characters available and return count
		 * 			in integer format.
		 */
		String Mobile="9030248855";
		int length=Mobile.length();
		System.out.println("Mobile number length is => "+length);
		
		
		/*
		 * trim:--> 
		 * 		method trim extra spaces available string.
		 */
		String Pincode="    500000     ";
		System.out.println("before trim length is => "+Pincode.length());
		
		//Trim Pincode with extra spaces
		String New_pincode=Pincode.trim();
		System.out.println("After trim length is => "+New_pincode.length());
		
		
		/*
		 * Startwith:-->
		 * 		method verify given string starts with expected character sequence
		 * 		and return boolean value true/false.
		 */
		String IFSC="HDFC0011";
		boolean flag4=IFSC.startsWith("HDFC");
		System.out.println("IFSC start with HDFC => "+flag4);
		
		
		/*
		 * Endswith:-->
		 * 		method verify given string ends with expected character sequence
		 * 		and return boolean value true/false.
		 */
		String Aadhar_num="67676762222";
		boolean flag5=Aadhar_num.endsWith("2222");
		System.out.println("Aadhar_num ends with 2222 => "+flag5);
		
		/*
		 * ToUpperCase:-->
		 * 		method convert available charcters from lowercase to uppercase
		 */
		String toolname="webdriver";
		String New_tool=toolname.toUpperCase();
		System.out.println("toolname in uppercase are => "+New_tool);
		
		
		/*
		 * ToLowerCase:-->
		 * 		method convert available charcters from uppercase characters
		 * 				ti lowercase
		 */
		String email="INFO.DSNR@GMAIL.com";
		String new_email=email.toLowerCase();
		System.out.println("email in lowercase are => "+new_email);
		
		
		
		
		
		
		

	}

}

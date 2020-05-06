package method_return_keyword;

import method_parameters.Keywords;

public class Run_Keywords {

	public static void main(String[] args) {
		
		//Crete object for keywords class
		Keywords obj=new Keywords();
		obj.Launch_Browser("chrome");
		obj.Launch_App("http://facebook.com");
		obj.time(40);
		
		
		if(obj.isTitle_Presented("Facebook"))
			System.out.println("FB title verified");
		else
			System.out.println("FB title not verified");
		
		
		if(obj.is_Url_Presented("https://www.facebook.com/"))
			System.out.println("FB url verified");
		else
			System.out.println("FB Url not verified");
		
		

	}

}

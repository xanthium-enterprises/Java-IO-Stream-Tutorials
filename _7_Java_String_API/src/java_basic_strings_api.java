// Basic Java  Text Manipulation API

public class java_basic_strings_api
{
	public static void main(String[] Args)
	{
		String MyString      = "Hello World for String API";
		String MyStringEmpty = "";

		
		System.out.println("String            = " + MyString);
		System.out.println("Is String Empty ? = " + MyString.isEmpty());
		System.out.println("Length            = " + MyString.length());
		
		System.out.println("\n\n");
		
		System.out.println("String            = " + MyStringEmpty);
		System.out.println("Is String Empty ? = " + MyStringEmpty.isEmpty());
		System.out.println("Length            = " + MyStringEmpty.length());
		
		//charAt() Method
		System.out.println("\n\n");
		
		for(int i = 0;i < MyString.length();i++)
			System.out.println("Character - " + MyString.charAt(i) + "  @ Position - " + i +"\n");
		
		
	}
}
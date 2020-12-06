//Java String comparison using == and equals() method
 

public class java_string_compare
{
	public static void main(String[] Args)
	{
		String MyString_Literal1 = "foo"; // String Literals
		String MyString_Literal2 = "foo";
		String MyString_Literal3 = "foobar";
		
		// Literal Comparison using ==
        System.out.println(MyString_Literal1 == MyString_Literal2); // true
		System.out.println(MyString_Literal1 == MyString_Literal3); // false
		
		System.out.println("\n");
		
		// object Comparison using ==
		String MyString_Object1 = new String("boo"); // String Objects
		String MyString_Object2 = new String("boo");
		String MyString_Object3 = new String("foobar");
		
		System.out.println(MyString_Object1 == MyString_Object2);//false
		
		System.out.println("\n");
		
		// object Comparison using equals()
		System.out.println(MyString_Object1.equals(MyString_Object2));// true
		System.out.println(MyString_Object1.equals(MyString_Object3));// false
		
	}
}
import java.util.*;
public class Stringoperations
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//String s = scan.nextLine();
	//char_removing_from_string(s);
	String f_name = "JEEVA";
	String m_name = "Jeeva";
	System.out.println(f_name.compareTo(m_name));
	System.out.println(f_name.compareToIgnoreCase(m_name));
	}
	public static void char_removing_from_string(String s)
	{
	 //String before removing char
	System.out.println(s);
	/*Removing 0to9 numbers and a to z char from the String
	 and saving it int the same string*/
    s = s.replaceAll("[0-9,a-z]","");
    //String after removing operation
	System.out.println(s);
	}
}

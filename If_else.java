
public class If_else
{
	public static void main(String[] args) {
	int a =-7;
	//conventional if else statement;
	if(a>=1)
	{
	    System.out.println("positive Integer");
	}
	else if(a<=-1)
	{
	    System.out.println("negative Integer");
	}
	else{
	    System.out.println("Integer 0");
	}
	//siongle line if else statement ;
String b = (a>=1)?"positive Integer":(a<=-1)?"negative Integer":"Integer 0";
	System.out.println(b);
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Primitve_to_string_convertion
{
	public static void main(String[] args) {
	    int i = 55;
	    long lng = 7777777;
	    short srt = 2;
	    String num = String.format("%d",i);
	    String l = String.format("%d",lng);
	    String s = String.format("%d",srt);
	    float flt = 25;
	    String f = String.format("%f",flt);
	    double dbl = 7.257257277;
	    String d = String.format("%f",dbl);
	    boolean bln = true;
	    String b = String.format("%b",bln);
	    char c = 'A';
	    String chr = String.format("%c",c);
	    System.out.println(num);
	    System.out.println(l);
	    System.out.println(s);
	    System.out.println(f);
	    System.out.println(d);
	    System.out.println(b);
	    System.out.println(chr);
	}
}

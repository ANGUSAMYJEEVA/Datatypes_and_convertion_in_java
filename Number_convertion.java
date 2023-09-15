public class Number_convertion
{
	public static void main(String[] args) {
	    int a =77;
	    String h = Integer.toHexString(a);
	    String b = Integer.toBinaryString(a);
	    String o = Integer.toOctalString(a);
	    System.out.println(h);
	    System.out.println(b);
	    System.out.println(o);
	    int dcml = Integer.parseInt(o,8);
	    int dciml = Integer.parseInt(b,2);
	    int deciml = Integer.parseInt(h,16);
	    System.out.println(dcml);
	    System.out.println(dciml);
	    System.out.println(deciml);
	}
}

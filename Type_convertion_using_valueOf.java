public class Type_convertion_using_valueOf
{
	public static void main(String[] args) {
	    int i = 7;
	    long lng = Long.valueOf(i);
	    float flt = Float.valueOf(lng);
	    double dbl = Double.valueOf(flt);
	    String str = String.valueOf(i);
	    int n = Integer.valueOf(str);
	    System.out.println(lng);
	    System.out.println(flt);
	    System.out.println(dbl);
	    System.out.println(str);
	    System.out.println(n);
	}
}

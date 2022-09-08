package audip;
public class calculator {
public int add(int a, int b)
{
	int ad=a+b;
	System.out.print("sum of these number are");
	return ad;
	
}
public double add(double a,int b,int p) {
	double n=a+b+p;
	System.out.println("add of double ");
	return n;
}
public String add(String a, String b) {
	String i = a+b;
	System.out.print("add of string");
return i;
}
public int sub(int a, int b)
{
	int sb=a-b;
	System.out.print("sub of these number are");
	return sb;
}
public double sub(double a, double b) {
	double c=a-b;
	System.out.println("sub of double ");
	return c;

}
}
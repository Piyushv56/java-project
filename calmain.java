package audip;

public class calmain {
 public static void main (String args[]){
	 calculator c = new calculator();
	 System.out.println("additon");
 System.out.println(c.add("15","30"));
 System.out.println(c.add(33.11, 77,99));
 System.out.println(c.add(11, 22));
 
 System.out.println("Substraction");
 System.out.print(c.sub(91.23, 91.11));
 System.out.print(c.sub(19, 9));
 }
}

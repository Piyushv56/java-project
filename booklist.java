package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class booklist {
	public static void main (String args[]) {
	List<Classbook>a1 =new ArrayList<>();// array list created
	Classbook l1= new Classbook(96789,"Gurgaon","Haryana");
	Classbook l2= new Classbook(8649,"Narnul","Haryana");
	Classbook l3= new Classbook(21409,"rewari","Haryana");
	a1.add(l1);
    a1.add(l2);
    a1.add(l3);
    System.out.println("array list 1");
    for (Classbook e:a1)
    {
    	System.out.print(e);
    }
    
    List<Classbook>c1= new ArrayList<>();
    Classbook k1= new Classbook(10001,"Gann","Haryana");
	Classbook k2= new Classbook(10003,"Piu","Haryana");
	Classbook k3= new Classbook(29923,"MNC","Haryana");
    
    c1.add(k1);
    c1.add(k2);
    c1.add(k3);
    System.out.println("Arry list 2");
	for (Classbook p:c1) {
		System.out.print(p);
	}
	}
	}

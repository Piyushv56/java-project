package collection;
import java.util.*;
public class student {
	public static void main (String args []) {
		HashMap<Integer,String>
		map =new HashMap<Integer,String>(); // creating hashmap
		map.put(101,"Piyush");
		map.put(102,"aman");
		map.put(103,"ankit");
		map.put(104,"bhavesh");
		map.put(105,"lavi");
		System.out.print("iteraing hashmap");
		for(Map.Entry m:map.entrySet())){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}

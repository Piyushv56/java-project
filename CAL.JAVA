import java.util.*;
class piyu {
@SuppressWarnings("resource")
public static void main(String[]pi) {
	Scanner sc = new Scanner(System.in);
	int calcultar = sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	switch (calcultar) {
	case 1: System.out.println(a+b);
	break;
	case 2: System.out.println(a-b);
	break;
	case 3: System.out.println(a*b);
	break;
	case 4: if (b==0) {
		System.out.println("invalid divison");
	}else {
			System.out.println(a/b);
		}
	case 5: if (b==0) {
		System.out.println("invalid remender");
	} else {
		System.out.println(a%b);
	}
	default : System.out.println("invalid operator");
	
	}
	}
	
	}
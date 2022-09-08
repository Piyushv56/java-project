package audip;

public class main {
	public main() {
	}
	public static void main (String agrs[]) {
		student Stu = new student(001,"Piyush",21);
		student Stu1 = new student(002,"aman",22);
		student Stu2 = new student(003,"Ankit",23);
		
		System.out.println("the institute name of student is "+Stu.getInstituteName());
		System.out.println("the roll no name of student is "+Stu.getRoll_no());
		System.out.println("the name of student is "+Stu.getName());
		System.out.println("the age of student is "+Stu.getAge());
	
		System.out.println("the institute name of student is "+Stu1.getInstituteName());
		System.out.println("the roll no name of student is "+Stu1.getRoll_no());
		System.out.println("the name of student is "+Stu1.getName());
		System.out.println("the age of student is "+Stu1.getAge());

		System.out.println("the institute name of student is "+Stu2.getInstituteName());
		System.out.println("the roll no name of student is "+Stu2.getRoll_no());
		System.out.println("the name of student is "+Stu2.getName());
		System.out.println("the age of student is "+Stu2.getAge());
	}
	
	

}

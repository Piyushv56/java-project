package audip;

public class student {
final static String Institute_name="Dronacharya";
private int rollno;
private String Name;
private int age;
public int getRoll_no() {
	return rollno;
}
public void setRoll_no(int roll_no) {
	this.rollno = roll_no;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static String getInstituteName() {
	return Institute_name;
}
public student() {
super ();
}

public student(int roll_no, String name, int age) {
	super();
	this.rollno = roll_no;
	Name = name;
	this.age = age;
}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + Name + ", age=" + age + "]";
}
}
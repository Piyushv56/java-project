class shape
{
	void shap()
	{
		System.out.println("This is Shape");
	}
}
class Rectangle extends shape
{
	void shap()
	{
		System.out.println("This is Rectangle Shape");
	}
}
class Circle extends shape
{
	void shap()
	{
		System.out.println("This is Circular Shape");
	}
}

public class Piyush{

	public static void main(String[] args) {
		shape sh = new shape();
		sh.shap();
		
		Rectangle r = new Rectangle();
		r.shap();

	}

}
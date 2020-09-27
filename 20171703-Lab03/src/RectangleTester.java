import java.awt.Rectangle;

public class RectangleTester {

	public static void main(String[] args)	{

		Rectangle r1 = new Rectangle(0, 0, 100, 50);

		/* Your code goes here */
		Rectangle r2 = r1;
		
		/* and here */
		r2.grow(10, 20);
		System.out.println(r1);
		System.out.println(r2);
	}
	
}
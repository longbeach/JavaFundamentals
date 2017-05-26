package celinio.net;

/**
 * objects are passed by reference
 * @author fernandescn 
 *
 */ 
public class PassByReference {  

	public static void main(String[] args) {
		Point p = new Point(1, 2);

		System.out.println("Main - Before - p : " + p);
		transform(p);
		System.out.println("Main - After -  p : " + p);

	}

	private static void transform(Point p) {
		System.out.println("Transform - p vaut : " + p);
		p.setX(9);
		p.setY(10);
	}

}

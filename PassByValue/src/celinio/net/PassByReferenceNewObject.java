package celinio.net;

/**
 * 
 * @author fernandescn
 *
 */
public class PassByReferenceNewObject { 
	
	public static void main(String[] args) { 
		Point p = new Point(1, 2); 

		System.out.println("Main - Before - p : " + p);
		transform(p);
		System.out.println("Main - After -  p : " + p);

	}

	private static void transform(Point p) {
		System.out.println("Transform - p vaut : " + p);
		  p = new Point(8,7);
	}

}

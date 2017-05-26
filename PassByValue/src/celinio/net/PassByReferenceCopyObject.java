package celinio.net;

public class PassByReferenceCopyObject {

	public static void main(String[] args) {
		Point p = new Point(1, 2);

		System.out.println("Main - Before - p : " + p);
		transform(p);
		System.out.println("Main - After -  p : " + p);

	}

	private static void transform(Point p) {
		System.out.println("Transform - p vaut : " + p);
		Point a = new Point(5,9);
		p = a;
	}

}

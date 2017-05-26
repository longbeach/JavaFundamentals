package celinio.net;

/**
 * Primitives are passed by value
 * @author fernandescn
 *
 */
public class PassByValue {

	public static void main(String[] args) {
		String val = "tutu";
		System.out.println("Main - Before - val : " + val);
		transform(val);
		System.out.println("Main - Before - val : " + val);
	}

	private static void transform(String val) {
		System.out.println("Transform - val  : " + val);
		val = "titi";
	}
}

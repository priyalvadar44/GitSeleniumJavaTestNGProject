package JavaPractice;

public class Reverse1 {

	public static void main(String[] args) {
		String s = "Automation";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}

}

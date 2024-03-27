package stringbuffer;

public class Quiz1 {

	public static void main(String[] args) {
		String s1 = new String("abc technologies");
		StringBuffer s2 = new StringBuffer("abc technologies");
		String r1 = s1.substring(6,12);
		String r2 = s1.substring(6);
		String r3 = s2.substring(6,12);
		String r4 = s2.substring(6);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		

	}

}

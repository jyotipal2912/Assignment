package stringbuffer;

public class StrQuestion1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		System.out.println("*******************");
		
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));
		System.out.println("*******************");
		
		String str="Was it a car or a cat I saw?";
		System.out.println(str.substring(9,12));
		System.out.println("*******************");
		
		String original = "software";
        StringBuffer result = new StringBuffer("hi");
        int index = original.indexOf('a');
        result.setCharAt(0, original.charAt(0));
        result.setCharAt(1, original.charAt(original.length()-1));
        result.insert(1, original.charAt(4));
        result.append(original.substring(1,4));
        result.insert(3, (original.substring(index, index+2) + " "));
        System.out.println(result);
        System.out.println("*******************");
        
        String hi="Hi";
        String mom="Mom";
        System.out.println(hi+", ".concat(mom)+".");
        System.out.println("....................");
        
        StringBuffer sn=new StringBuffer();
        sn.append("jyoti ");
        sn.append("Pal");
        String res=sn.toString();
        System.out.println(res);
        System.out.println("*******************");
        
        String name = "Ms.Jyoti Pal";
        System.out.println(name.substring(0, name.indexOf(".")));
        System.out.println("*******************");
      
	}

}

package corejavaex;

public class ParameterizedConstructor {
	public ParameterizedConstructor () {
		this(0);
		System.out.println("A");
	}
public ParameterizedConstructor(int k) {
	this(0, 0);
	System.out.println("B");
	}
public ParameterizedConstructor(int k, int m) {
	System.out.println("C");
	}
 
public static void main(String[] args){
	int k = 5, j = 6;
	ParameterizedConstructor a = new ParameterizedConstructor();
	ParameterizedConstructor b = new ParameterizedConstructor(k*j);
	ParameterizedConstructor c = new ParameterizedConstructor(k,j);
}

}

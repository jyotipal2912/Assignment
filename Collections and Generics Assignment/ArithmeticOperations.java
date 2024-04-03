package collectionsAndGenericsAssignment;

import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
	public static <T extends Number> Number add(T t1, T t2) {
		return t1.doubleValue() + t2.doubleValue();
	}

	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++) {
			d += list.get(i).doubleValue();
		}
		return new Double(d);
	}

	public static <T extends Number> Number sub(T t1, T t2) {
		return t1.doubleValue() - t2.doubleValue();
	}

	public static <T extends Number> Number sub(List<? extends Number> list) {
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++) {
			d -= list.get(i).doubleValue();
		}
		return new Double(d);
	}

	public static <T extends Number> Number div(T t1, T t2) {
		return t1.doubleValue() / t2.doubleValue();
	}

	public static <T extends Number> Number div(List<? extends Number> list) {
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++) {
			d /= list.get(i).doubleValue();
		}
		return new Double(d);
	}

	public static <T extends Number> Number mul(T t1, T t2) {
		return t1.doubleValue() * t2.doubleValue();
	}

	public static <T extends Number> Number mul(List<? extends Number> list) {
		double d = 0;
		for (int i = 0; i < list.size(); i++) {
			d *= list.get(i).doubleValue();
		}
		return new Double(d);
	}

	public static void dumpList(List<?> list) {
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		// Adding 2 integers
		Integer i1 = new Integer(34), i2 = new Integer(43);
		System.out.println("Add Integer with generic method: " + ArithmeticOperations.add(i1, i2));
		System.out.println("Sub Integer with generic method: " + ArithmeticOperations.sub(i1, i2));
		System.out.println("Mul Integer with generic method: " + ArithmeticOperations.mul(i1, i2));
		System.out.println("Div Integer with generic method: " + ArithmeticOperations.div(i1, i2));

		Float f1 = new Float(12.56), f2 = new Float(3.6778);
		System.out.println("Add Float with generic method: " + ArithmeticOperations.add(f1, f2));
		System.out.println("Sub Float with generic method: " + ArithmeticOperations.sub(f1, f2));
		System.out.println("Mul Float with generic method: " + ArithmeticOperations.mul(f1, f2));
		System.out.println("Div Float with generic method: " + ArithmeticOperations.div(f1, f2));

		// Adding 2 integers through a list
		Vector<Number> l = new Vector<Number>();
		l.add(new Integer(34));
		l.add(new Integer(43));
		System.out.println("Add Vector with upper bounded wildcard: " + ArithmeticOperations.add(l));
		System.out.println("Sub Vector with upper bounded wildcard: " + ArithmeticOperations.sub(l));
		System.out.println("Mul Vector with upper bounded wildcard: " + ArithmeticOperations.mul(l));
		System.out.println("Div Vector with upper bounded wildcard: " + ArithmeticOperations.div(l));

		// Dumping the list to the console.
		ArithmeticOperations.dumpList(l);
	}

}

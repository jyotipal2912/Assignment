package javaCodingAssignment;

public class Number {
	static boolean checkPrime(int x) {
		if (x <= 1) {
			return false;
		} else {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	static boolean checkAmstrong(int x) {
		int num = 0, temp, sum = 0;
		temp = x;
		while (temp > 0) {
			temp = temp / 10;
			num++;
		}
		System.out.println("No. of digits: " + num);
		temp = x;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum += (int) Math.pow(lastDigit, num);
			temp = temp / 10;
		}
		if (sum == x)
			return true;
		return false;

	}

	static boolean checkPalindrome(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord += word.charAt(i);
		}
		if (word.equals(revWord)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Question 1(Prime)
		System.out.println("*****TO CHECK PRIME NUMBER OR NOT*****");
		int numToCheck = 29;
		if (checkPrime(numToCheck)) {
			System.out.println(numToCheck + " is Prime Number.");
		} else {
			System.out.println(numToCheck + " is Not a Prime Number. ");
		}

		// Question 2(Armstrong)
		System.out.println("*****TO CHECK ARMSTRONG NUMBER OR NOT*****");
		int num = 141;
		if (checkAmstrong(num)) {
			System.out.println(num + " is an Armstrong Number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}

		// Question 3(Palindrome)
		System.out.println("*****TO CHECK PALINDROME OR NOT*****");
		String str = "malayalam";
		if (checkPalindrome(str)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

}

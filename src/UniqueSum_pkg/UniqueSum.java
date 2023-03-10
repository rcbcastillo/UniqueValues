package UniqueSum_pkg;

public class UniqueSum {

	static void sumIfUniqueValues(int a, int b, int c) {

		if (a != b && a != c && b != c) {
			int sum = a + b + c;
			System.out.println(sum);
		} else {

			if (a == b && a != c) {
				int sum = c;
				System.out.println(sum);
			} else if (a != b && b == c) {
				int sum = a;
				System.out.println(sum);

			} else if (a == c) {
				int sum = b;
				System.out.println(sum);

			} else if (a == b && b == c) {
				int sum = 0;
				System.out.println(sum);
			}
		}

	}

	public static void main(String[] args) {
		sumIfUniqueValues(1, 2, 3);
		sumIfUniqueValues(3, 3, 3);
		sumIfUniqueValues(1, 1, 2);
		sumIfUniqueValues(1, 2, 2);
		sumIfUniqueValues(1, 2, 1);
	}
}

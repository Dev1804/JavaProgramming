
public class CommaOperator {

	public static void main(String[] args) {

		for (int i = 1, j = i + 5; i < 5; i++, j = i * 3) {
			System.out.println("i = " + i + " j = " + j);

		}

	}
}

/*
 OUTPUT: 
 i = 1 j = 6
 i = 2 j = 6
 i = 3 j = 9
 i = 4 j = 12
 */

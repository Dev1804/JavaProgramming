
// Relational and logical operators.
import java.util.*;

public class Operators {

	public static void main(String[] args) {

		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));
		System.out.println("(i < 25) && (j < 25) is " + ((i < 25) && (j < 25)));
		System.out.println("(i < 25) || (j < 25) is " + ((i < 25) || (j < 25)));
	}

}
/*
Output: 
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 25) && (j < 25) is false
(i < 25) || (j < 25) is false
*/
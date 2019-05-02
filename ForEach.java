import java.util.*;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(18);
		 float f[] = new float[10];
		 for(int i = 0; i < 10; i++)
		 f[i] = rand.nextFloat();
		 for(float x : f)
		 System.out.println(x); 
	}

}
/*
OUTPUT:
0.73258024
0.988861
0.18873727
0.1866427
0.37206382
0.21972388
0.4693963
0.3635152
0.933754
0.055844605
*/
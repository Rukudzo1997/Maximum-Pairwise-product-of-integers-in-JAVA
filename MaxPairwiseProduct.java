import java.util.Scanner;
import java.util.Arrays;


public class MaxPairwiseProduct {
	
	public void maxPairwiseProduct(long[] S){
		
		Arrays.sort(S);
		long max = S[S.length-2]*S[S.length-1];
		System.out.println(max);
	}
	


	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		long[] S = new long[n]; 
	
		for (int i = 0; i < n; i++)
		{ 
			S[i] =  s.nextLong();
		}

		MaxPairwiseProduct maxp = new MaxPairwiseProduct();
		maxp.maxPairwiseProduct(S);
		s.close();
	}
}

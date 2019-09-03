
import java.util.Scanner;
import java.util.Arrays;
public class MaxPairwiseProduct {
	
	public void maxPairwiseProduct(long[] array){
		int n = array.length;
		Arrays.sort(array);
		System.out.println(array[n-1]*array[n-2]);
	}
	
	
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] array = new long[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = in.nextLong();
		}
		
		MaxPairwiseProduct mpwp = new MaxPairwiseProduct();
		mpwp.maxPairwiseProduct(array);
		in.close();
	}
}

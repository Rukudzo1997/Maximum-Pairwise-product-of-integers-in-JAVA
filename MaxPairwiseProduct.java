
import java.util.Scanner;
public class MaxPairwiseProduct {
	
	public void maxPairwiseProduct(long[] array){
		long max = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++){
				long running_max = array[i]*array[j];
				if(running_max > max) {
					max = running_max;
				}
			}
		}
		System.out.println(max);
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


public class MaximumPairWiseProduct {
	int max = 0;
	public void maxPairwiseProduct(int[] S){
		for(int i= 0; i < S.length - 1; i++) {
			for (int j = 1;j < S.length; j++){
				
				if(max < S[i]*S[j]) {
					max = S[i]*S[j];
				}
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int[] S = {1,2,3,4, 4, 4, 5};
		MaximumPairWiseProduct maxp = new MaximumPairWiseProduct();
		maxp.maxPairwiseProduct(S);
	}
}

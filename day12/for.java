public class For{
	public static void main(String[] args){
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int i=0;i<3;i++){
			for(int n:nums[i]){
				System.out.print(n);
			}
		}
	}
}

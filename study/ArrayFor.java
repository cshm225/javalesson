public class ArrayFor{
	public static void main(String[] args){
		int[] score={20,30,40,50,80};
		int sum=0,i;
		double ave;
		for(i=0;i<score.length;i++){
			System.out.println(score[i]);
			sum+=score[i];
		}
		ave=sum/score.length;
		System.out.println(ave);
	}
}

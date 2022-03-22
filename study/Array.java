public class Array{
	public static void main(String[] args){
		int[] score={20,30,40,50,80};
		int num=score.length;
		int sum;
		double ave;
		System.out.println("配列の長さは"+num);
		score[0]=3;
		System.out.println("配列1"+score[0]);
		sum=score[0]+score[1]+score[2]+score[3]+score[4];
		ave=sum/num;
		System.out.println("平均は"+ave);
	}
}

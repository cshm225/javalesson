import java.util.*;
public class Scores{
	public static void main(String[] args){
		int sum=0;
		System.out.print("何人");
		int n=new Scanner(System.in).nextInt();
		int[] scores=new int[n];
		for(int i=0;i<n;i++){
			scores[i]=new Random().nextInt(101);
			sum+=scores[i];
		}
		System.out.println(Arrays.toString(scores));
		System.out.printf("合計は%d 平均は%.1f\n",sum,(double)sum/n);
		int max=scores[0];
		int min=scores[0];
		for(int i=1;i<scores.length;i++){
			if(scores[i]>max){
				max=scores[i];
			}
			if(scores[i]<min){
				min=scores[i];
			}
		}
		System.out.printf("最高は%d最低は%d",max,min);
	}
}

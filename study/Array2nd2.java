import java.util.*;
public class Array2nd2{
	public static void main(String[] args){
		int student=5;
		int j,sum=0,test=2;
		int[][] scores=new int[student][test];
		System.out.printf("No.| 英語 数学 | 合計%n---+-----------+-----%n");
		for(int i=0;i<student;i++){
			System.out.printf(" %d |",i+1);
			for(j=0;j<test;j++){
				scores[i][j]=new Random().nextInt(100);
				sum+=scores[i][j];
				System.out.printf("  %2d ",scores[i][j]);
			}
			System.out.printf(" | %3d%n",sum);
		}
	}
}

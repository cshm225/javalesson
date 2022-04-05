import java.util.*;
public class Array2nd{
	public static void main(String[] args){
		int[]=studentscore;
		int[]=kamokuscore;
		int student,kamoku;
		System.out.print("人数");
		student=new Scanner(System.in).nextInt();
		int[][] scores=new int[student][];
		for(int i=0;i<student;i++){
			System.out.print("科目数を入力");
			kamoku=new Scanner(System.in).nextInt();
			scores[i]=new int[][kamoku];
			for(int j=0;j<kamoku;j++){
				score[i][j]=new Random().nextInt();
				studentscore[i]+=score[i][j];
			}
			System.out.printf("出席番号%dの合計点数%d %n",i+1,score[i]);
		}
			for(int i=0;i<score.length;i++){
				kamokuscore[i]+=score[i]
			}

	}
}

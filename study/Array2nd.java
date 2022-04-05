import java.util.*;
public class Array2nd{
	public static void main(String[] args){
		int student,kamoku;
		System.out.print("人数");
		student=new Scanner(System.in).nextInt();
		int[] studentscore=new int[student];
		int[][] score=new int[student][];
		System.out.print("科目数を入力");
		kamoku=new Scanner(System.in).nextInt();
		int[] kamokuscore=new int[kamoku];
		for(int i=0;i<student;i++){
			score[i]=new int[kamoku];
			for(int j=0;j<kamoku;j++){
				score[i][j]=new Random().nextInt(100);
				studentscore[i]+=score[i][j];
				kamokuscore[j]+=score[i][j];
			}
		}
		System.out.printf("出席番号|");
		for(int i=0;i<kamoku+1;i++){
			if(i==kamoku){
				System.out.printf("合計  |");
			}else{
				System.out.printf("%2d科目|",i+1);
			}
		}
		for(int i=0;i<student+1;i++){
			if(i==student){
				System.out.printf("%n  合計  |");
			}else{
				System.out.printf("%n %2d     |",i+1);
			}
			for(int j=0;j<kamoku+1;j++){
				if(i==student&&j<kamoku){
					System.out.printf("  %d |",kamokuscore[j]);
				}else if(j==kamoku&&i<student){
					System.out.printf("  %d |",studentscore[i]);
				}else if(j<kamoku){
					System.out.printf("  %2d  |",score[i][j]);
				}
			}
		}
	}
}

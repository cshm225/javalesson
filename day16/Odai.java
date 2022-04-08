import java.util.*;
public class ArrayScore{
	public static void main(String[] args){
		int[][] scores;
		int student,subject=3;
		int[] sum;
		sum=new int[subject];
		int max=-1,min=101;
		String max_Name="null",min_Name="null";
		String[] names;
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		Scanner scan3=new Scanner(System.in);
		System.out.print("生徒数を入力>>");
		student=scan.nextInt();
		scores=new int[student][];
		names=new String[student];
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の名前を入力>>",i+1);
			names[i]=scan2.nextLine();
			scores[i]=new int[subject];
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%d人目の%d科目の点数を入力>>",i+1,j+1);
				scores[i][j]=scan3.nextInt();
				sum[i]+=scores[i][j];
				if(max<sum[i]){
					max=sum[i];
					max_Name=names[i];
				}
			}
		}
		ArrayPrint(scores,names,sum);
		System.out.printf("合計点数が1番高かったのは%sさんで%d点です。%n",max_Name,max);
	}
	public static void ArrayPrint(int[][] scores,String names,int[] sum){

		System.out.printf("%n|名前|数学|物理|化学|合計|%n");
		for(int i=0;i<scores.length;i++){
			System.out.printf("|%s|",names[i]);
			for(int j=0;j<scores[i].length;j++){
				System.out.printf(" %3d|",scores[i][j]);
			}
			System.out.printf(" %3d|%n",sum[i]);
		}
	}

	public static void Sort(int[] sum,String[] name){
		int tmp;
		String tmp;
		for(int i=0;i<sum.length-1;i++){
			for(int j=i+1;j<sum.length;j++){
				if(sum[i]<sum[j]){

				}
			}
		}
	}
}

import java.util.*;
public class ArrayScore{
	public static void main(String[] args){
		int classRoom,classMate;
		int[][] scores;
		System.out.print("クラスの数>>");
		classRoom=new Scanner(System.in).nextInt();
		scores=new int[classRoom][];
		for(int i=0;i<classRoom;i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			classMate=new Scanner(System.in).nextInt();
			scores[i]=new int[classMate];
			for(int j=0;j<classMate;j++){
				System.out.printf("%d組%d人目の点数>>",i+1,j+1);
				scores[i][j]=new Scanner(System.in).nextInt();
			}
		}
		System.out.printf("--表出力--%n");
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d組",i+1);
			for(int j=0;j<scores[i].length;j++){
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}
	}
}

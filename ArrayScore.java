import java.util.*;
public class ArrayScore{
	public static void main(String[] args){

		int[][] scores;
		int class_Room,class_Mate;

		System.out.printf("クラスの数>>");
		class_Room=new Scanner(System.in).nextInt();
		scores=new int[class_Room][];

		for(int i=0;i<class_Room;i++){
			System.out.printf("%d組のクラスの人数>>",i+1);
			class_Mate=new Scanner(System.in).nextInt();
			scores[i]=new int[class_Mate];
			for(int j=0;j<class_Mate;j++){
				System.out.printf("%d組%d人目の点数>>",i+1,j+1);
				scores[i][j]=new Scanner(System.in).nextInt();
			}
		}

		System.out.printf("--表出力--%n");

		for(int i=0;i<scores.length;i++){
			System.out.printf("%d組",i+1);
			for(int j=0;j<scores[i].length;j++){
				System.out.printf(" %d",scores[i][j]);
			}
			System.out.println();
		}

	}
}

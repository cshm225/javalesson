import java.util.*;
public class Kimura{
	public static void main(String[] args){
		int[] sv;
		int max=-1;
		Random rnd1=new Random();
		Random rnd2=new Random();
		System.out.print("何回戦やる？");
		int n=new Scanner(System.in).nextInt();
		int[][] data=new int[n][2];
		sv=new int[n];
		for(int i=0;i<n;i++){
			max=-1;
			for(int j=0;j<2;j++){
				data[i][j]=rnd1.nextInt(100);
				if(max<data[i][j]){
					max=data[i][j];
				}
			}
				sv[i]=max;
		}

		for(int i=0;i<sv.length-1;i++){
			for(int j=i+1;j<sv.length;j++){
				int tmp;
				if(sv[i]<sv[j]){
					tmp=sv[i];
					sv[i]=sv[j];
					sv[j]=tmp;
				}
			}
		}

		for(int i=0;i<n;i++){
			System.out.printf("%d回目:",i+1);
			for(int j=0;j<1;j++){
				System.out.printf("ランダム生成された数字は「%d」と「%d」、「%d」が大きい",data[i][j],data[i][j+1],sv[i]);
			}
			System.out.println();
		}

		System.out.printf("%n--比較終了--%n生き残りは%s%n",Arrays.toString(sv));
		
	}
}

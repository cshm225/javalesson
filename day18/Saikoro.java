import java.util.*;
public class Saikoro{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[][] saikoro;
		char[] names;
		System.out.print("何人>");
		int num=scan.nextInt();
		names=new char[num];
		names[0]='A';
		System.out.print("何回>");
		int saikoronum=scan.nextInt();
		saikoro=new int[num][saikoronum];
		rndsaikoro(saikoro,num,names);

	}
	static void print(int[][] saikoro,int[] sum,char[] names,char[] winner){
		for(int i=0;i<saikoro.length;i++){
			System.out.printf("%s:%s 合計%d\n",names[i],Arrays.toString(saikoro[i]),sum[i]);
		}
		for(int i=0;i<winner.length;i++){
			System.out.printf("%sさん,",winner[i]);
		}
		System.out.print("の勝ち");
	}
	static void rndsaikoro(int[][] saikoro,int num,char[] names){
		Random rnd=new Random();
		int[] sum=new int[num];
		char[] winner;
		for(int i=0;i<saikoro.length;i++){
			if(i!=0){
				names[i]=names[i-1]++;
			}
			for(int j=0;j<saikoro[i].length;j++){
				saikoro[i][j]=rnd.nextInt(6)+1;
			}
			sum[i]=sum(saikoro[i]);
		}
		winner=judgment(sum,names);
		print(saikoro,sum,names,winner);

	}
	static int sum(int[] saikoro){
		int sum=0;
		for(int i=0;i<saikoro.length;i++){
			sum+=saikoro[i];
		}
		return sum;
	}
	static char[] judgment(int[] sum,char[] name){
		int max=0;
		char winner[];
		for(int i=0;i<sum.length;i++){
			if(max<=sum[i]){
				max=sum[i];
			}
		}
		for(int i=0;i<sum.length;i++){
			if(max==sum[i]){
				winner[i]=name[i];
			}
		}
		return winner;
	}
}

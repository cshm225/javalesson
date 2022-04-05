import java.util.*;
public class MonthSales{
	public static void main(String[] args){
		final int MONTH=12;
		int[][] sales;
		int[] sum=new int[MONTH];
		sales=new int[MONTH][];
		for(int i=0;i<MONTH;i++){
			System.out.printf("%2d|",i+1);
			if(i==1){//月の判定
				sales[i]=new int[28];
			}else if((i+1)%2!=0&&i<8||i>=7&&(i+1)%2==0){
				sales[i]=new int[31];
			}else{
				sales[i]=new int[30];
			}
			for(int j=0;j<sales[i].length;j++){//代入しつつ表示
				sales[i][j]=new Random().nextInt(41)+10;
				System.out.printf("%2d ",sales[i][j]);
				sum[i]+=sales[i][j];
			}
			System.out.printf("|%3d%n",sum[i]);
		}
	}
}

import java.util.*;
public class Slot{
	public static void main(String[] args){
		int[][] slot=new int[3][3];
		Random rnd=new Random();
		int count=0;
		for(int i=0;i<slot.length;i++){
			for(int j=0;j<slot[i].length;j++){
				slot[i][j]=rnd.nextInt(3)+1;
				System.out.printf("%d",slot[i][j]);
			}
			System.out.println();
			boolean isSame=isSame(slot[i]);
			if(isSame){
				count++;
			}
		}
		System.out.println(count==0?"Lose...":count+" line win!!!!!");

	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first!=arr[i]){
				return false;
			}
		}
		return true;
	}

}

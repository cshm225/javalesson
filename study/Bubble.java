import java.util.*;
public class Bubble{
	public static void main(String[] args){
		int num;
		System.out.print("配列の数入力>>");
		num=new Scanner(System.in).nextInt();
		System.out.println("配列に格納する値は>>");
		int nums[]=new int[num];
		//配列に格納
		for(int i=0;i<nums.length;i++){
			nums[i]=new Scanner(System.in).nextInt();
		}
		sort(nums);
		for(int i=0;i<nums.length;i++){
			
			System.out.printf("%d ",nums[i]);
		}
	}
	//ソート
	public static void sort(int[] sort){
		int tmp;
		//iを左カーソルjを右カーソルとしカーソルの値同士を比較し大きいのをiに格納
		for(int i=0;i<sort.length-1;i++){
			for(int j=i+1;j<sort.length;j++){
				if(sort[i]>sort[j]){
					tmp=sort[j];
					sort[j]=sort[i];
					sort[i]=tmp;
				}
			}
		}
	}
}

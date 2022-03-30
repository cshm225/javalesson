import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		int tmp,number;
		System.out.println("配列の数を入力");
		number=new Scanner(System.in).nextInt();
		int[] sort=new int[number];
		System.out.printf("数字を%d個入力\n",number);
		for(int i=0;i<number;i++){
			sort[i]=new Scanner(System.in).nextInt();
		}
		sort(sort,0,1);
	}
	public static void sort(int[] sort,int left,int right){
		int tmp,pl,pr,count;
		for(int i=0;i<sort.length-1;i++){
		System.out.println(Arrays.toString(sort));
			for(int j=i+1;j<sort.length;j++){
				if(sort[i]>sort[j]){
					tmp=sort[i];
					sort[i]=sort[j];
					sort[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(sort));
	}
}

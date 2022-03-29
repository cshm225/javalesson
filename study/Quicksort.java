import java.util.*;
public class Quicksort{
	public static void main(String[] args){
		int i,x;
		int[] sort=new int[10];
		//System.out.print("要素を入力:");
		//x=new Scanner(System.in).nextInt();
		System.out.println("数字を10個入力");

		for(i=0;i<10;i++){
			sort[i]=new Scanner(System.in).nextInt();
		}
		for(i=0;i<10;i++){
			System.out.print("sort["+i+"]="+sort[i]+"  ");
		}
		System.out.println(" ");
		sort(sort,0,9);
		System.out.println("昇順にソートしました。");
		for(i=0;i<10;i++){
			System.out.println("sort["+i+"]="+sort[i]);
		}
	}
	public static void sort(int[] sort,int left,int right){
		int ave,pl,pr;
		if ( 1 >= sort.length ) return;
		if ( left >= right ) {
			return;
		}
		if((right-left)==1){
			if(sort[left]>sort[right]){
				swap(sort,left,right);
			}
			return;
		}
		pl=left;
		//System.out.println(pl);
		pr=right;
		//System.out.println(pr);
		ave=sort[left+right/2];
		//System.out.println(pl);
		while(true){
			System.out.println(pl+"pl");
			//System.out.println(pr+"pr");
			while(ave>=sort[pl]){
				pl++;
				if(pl>=pr){
					break;
				}
			}
			while(ave<=sort[pr]){
				System.out.println(ave+"ave");
				System.out.println(pr+"pr");
				pr--;
				if(pl>=pr){
					break;
				}
			}
			if(pl>=pr){
				break;
			}
			
			swap(sort,pl,pr);
		}
		if(pl==pr){
			pl++;
		}
//		sort(sort,left,pl);
	//	sort(sort,pr,right);

	}
	public static void swap(int[] sort,int left,int right){
		int tmp;
		tmp=sort[left];
		sort[left]=sort[right];
		sort[right]=tmp;
		for(int i=0;i<10;i++){
			System.out.print("sort["+i+"]="+sort[i]+"  ");
		}
		System.out.println(" \n");
	}
}

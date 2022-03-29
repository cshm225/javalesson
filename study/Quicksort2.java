import java.util.*;
public class Quicksort2{
	public static void main(String[] args){
		int[] sort={5,10,3,7,5,8,1,9,2};
		System.out.println("クイックソート");
		quicksort(sort,0,sort.length-1);
		for(int i=0;i<sort.length;i++){
			System.out.printf("sort[%d] %d\n",i,sort[i]);
		}
	}	
	public static void quicksort(int[] sort,int left,int right){
		int pl,pr,pivot;
		if(left>=right){
			return;
		}
		pivot=sort[(left+right)/2];
		pl=left;
		pr=right;
		while(pl<=pr){
			while(sort[pl]<pivot){
				pl++;
			}
			while(sort[pr]>pivot){
				pr--;
			}
			if(pl<=pr){
				int tmp;
				swap(sort,pl,pr);
				pl++;
				pr--;
			}
		}
		quicksort(sort,left,pr);
		quicksort(sort,pl,right);
	}
	public static void swap(int[] sort,int left,int right){
		int tmp;
		tmp=sort[left];
		sort[left]=sort[right];
		sort[right]=tmp;

	}
}

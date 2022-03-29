package quicksort.sort;
public class QuickSort{
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

import java.util.*;
public class QuickMain{
	public static void main(String[] args){
		int[] sort={5,10,3,7,5,8,1,9,2};
		System.out.println("クイックソート");
		QuickSort.quicksort(sort,0,sort.length-1);
		QuickPrint.printdata(sort);
	}	
	public static void printdata(int[] sort){
		for(int i=0;i<sort.length;i++){
			System.out.printf("sort[%d] %d\n",i,sort[i]);
		}
	}
}

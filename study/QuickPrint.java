package quicksort.print;
public class QuickPrint{
	public static void printdata(int[] sort){
		for(int i=0;i<sort.length;i++){
			System.out.printf("sort[%d] %d\n",i,sort[i]);
		}
	}
}

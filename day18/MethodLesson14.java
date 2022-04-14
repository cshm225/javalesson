import java.util.*;
public class MethodLesson14{
	public static void main(String[] args){
		int first=4,last=-2;
		int[] arr=makeArrFirstToLast(first,last);
		System.out.println(Arrays.toString(arr));
	}
	static int[] makeArrFirstToLast(int first,int last){
		int max,min;
		max=Math.max(first,last);
		min=Math.min(first,last);
		int[] retArr=new int[max-min+1];
		for(int i=0;i<retArr.length;i++){
			retArr[i]=max-i;
		}
		return retArr;
	}
}

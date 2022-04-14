import java.util.*;
public class MethodLesson13{
public static void main(String[] args){
	int[] arr1={1,2,3};
	int[] arr2={4,5,6,7};
	int[] arr3=arrMerge(arr1,arr2);
	System.out.println(Arrays.toString(arr3));
}
public static int[] arrMerge(int[] arr1,int[] arr2){
	int[] arr3=new int[arr1.length+arr2.length];
	for(int i=0;i<arr3.length;i++){
		if(i<arr1.length){
			arr3[i]=arr1[i];
		}
		if(i>=arr1.length){
			arr3[i]=arr2[i-arr1.length];
		}
	}
	return arr3;
}
}


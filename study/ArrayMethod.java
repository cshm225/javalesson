import java.util.*;
public class ArrayMethod{
	public static void main(String[] args){
		int[] arrayA={1,2,3};
		arrayB(arrayA);
		for(int i=0;i<arrayA.length;i++){
			System.out.println(arrayA[i]);
		}
	}
	public static void arrayB(int[] array){
		int i;
		for(i=0;i<array.length;i++){
			array[i]++;
		}
	}
}

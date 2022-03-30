import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA={3,5,10};
		int[] dataB;
		dataB=new int[] {4,6,10};
		for(int i=0;i<dataA.length;i++){
			System.out.printf("data[%d]=%d\n",i,dataA[i]);
		}
		for(int n:dataB){
			System.out.printf("%d\n",n);
		}
		System.out.printf("%s\n",Arrays.toString(dataA));
	}
}

import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.printf("a=%d b=%d",a,b);

		int[] data={1,2,3,4,5};
		for(int i=0;i<data.length/2;i++){

			tmp=data[i];
			data[i]=data[data.length-1-i];
			data[data.length-1-i]=tmp;
			
		}

		System.out.println(Arrays.toString(data));
	}
}

import java.util.*;
public class Method2{
	public static void main(String[] args){
		int arr[]={3,4,5};
		int total;
		System.out.printf("%s\n%d",Arrays.toString(arr),sumOf(arr));
		total=sumOf(new int[]{10,20,30});
		System.out.printf("\n%d\n",total);
		System.out.printf("%d\n",maxOf(3,5,6));
		hello();
		hello("AB");
		arrWrite(arr);
		System.out.println(Arrays.toString(arr));
		int arr2[]={1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
		arrShuffle(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	public static int sumOf(int[] arr){
		int sum=0;
		for(int n:arr){
			sum+=n;
		}
		return sum;
	}
	public static int maxOf(int a,int b,int c){
		return Math.max(a,Math.max(b,c));
	}
	public static void hello(){
		System.out.println("hello");
	}
	public static void hello(String name){
		hello();
		System.out.println(name);
	}
	public static void arrWrite(int[] arr){
		arr[0]=100;
	}
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length;i++){
			int idx=new Random().nextInt(arr.length-i)+i;
			int tmp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=tmp;
		}
	}
}

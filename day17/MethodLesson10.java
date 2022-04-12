public class MethodLesson10{
	public static void main(String[] args){
		int n=10,m[]={1,2,3};
		method1(n);
		System.out.println(n);
		method2(m);
		System.out.println(m[0]+m[1]+m[2]);
	}
	static void method1(int n){
		n++;
		System.out.println(n);
	}
	static void method2(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+1;
		}
	}
}

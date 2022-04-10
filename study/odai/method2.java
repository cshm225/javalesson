import java.util.*;
public class method2{
	public static void main(String[] args){
		System.out.print("段を入力>>");
		int num=new Scanner(System.in).nextInt();
		print(num);
	}
	public static void print(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

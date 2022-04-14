import java.util.*;
public class Q006{
	public static void main(String[] args){
		int num1,num2;
		System.out.print("先頭の整数を入力>>");
		num1=new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		num2=new Scanner(System.in).nextInt();
		int max=Math.max(num1,num2);
		int min=Math.min(num1,num2);
		for(int i=0;i<(max-min)+1;i++){
			System.out.print((num1<num2?num1++:num1--));
		}
		System.out.println();
		while(num1!=num2){
			System.out.print((num1<num2?num1++:num1--));
		}
		System.out.println(num2);
	}
}

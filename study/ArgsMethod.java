import java.util.*;
public class ArgsMethod{
	public static void main(String[] args){
		int a,b,x,y;
		System.out.println("数字を入力");
		x=new Scanner(System.in).nextInt();
		y=new Scanner(System.in).nextInt();
		add(x,y);
		a=add(x,y);
		b=add(x,y)+a;
		System.out.println(a+" "+b);
		
	}
	public static int add(int x,int y){
		int diff,sum;
		sum=x+y;
		System.out.println(sum);
		sum=x*y;
		System.out.println(sum);
		diff=x-y;
		return diff;
	}
}

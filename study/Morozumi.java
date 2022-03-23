import java.util.*;
public class Morozumi{
	public static void main(String[] args){
		int n;
		System.out.print("数字を入力");
		n=new Scanner(System.in).nextInt();
		switch(n){
			case 0:
				System.out.println("優");
				break;
			case 1:
				System.out.println("良");
				break;
			case 2:
				System.out.println("可");
				break;
			case 3:
				System.out.println("不可");
				break;
		}
	}
}

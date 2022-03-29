import java.util.*;
public class DoWhile{
	public static void main(String[] args){
		/*System.out.print("現在の値");
		int temp = new Scanner(System.in).nextInt();
		do{
			System.out.println("値を1下げました");
			temp--;
			System.out.println(temp);
		}while(temp>20);
		*/
		int n;
		do{
			System.out.print("正の整数");
			n=new Scanner(System.in).nextInt();
		}while(n<=0);
		System.out.println(n+"が入力");
	}
}

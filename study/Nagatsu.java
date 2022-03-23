import java.util.*;
public class Nagatsu{
	public static void main(String[] args){
		int n,m;
		System.out.println("数字を入力");
		n=new Scanner(System.in).nextInt();
		m=new Random().nextInt(10)+1;
		if(n-m>0 && n-m<4){
			System.out.println("勝");
		}else if(n-m>3){
			System.out.println("負け");
		}else if(n-m<0){
			System.out.println("負け");
		}else if(n==m){
			System.out.println("引き分け");
		}
	}
}

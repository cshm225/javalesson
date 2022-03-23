import java.util.*;
public class Sugawara{
	public static void main(String[] args){
		int n,m;
		System.out.println("数字を入力");
		n=new Scanner(System.in).nextInt();
		m=new Random().nextInt(10)+1;
		n=(n+m)%2;
		if(n==0){
			System.out.println(n+"目玉焼きとトースト");
		}else{
			System.out.println(n+"シリアルとヨーグルト");
		}
	}
}

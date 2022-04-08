import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.printf("自販機がある。買いますか？1買う0立ち去る>>");
		int money=new Random().nextInt(1500)+200;
		int num=new Scanner(System.in).nextInt();
		if(num==1){
			Jihanki a=new Jihanki();
		}
		
	}
}

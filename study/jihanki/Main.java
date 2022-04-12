import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.printf("自販機がある。買いますか？1買う0立ち去る>>");
		int money=new Random().nextInt(1500)+200;
		int num=new Scanner(System.in).nextInt();
		System.out.printf("所持金%d%n",money);

		//if(num==1){
			Jihanki a=new Jihanki();
		//}
			
		int pay=a.buy();
		money=money-pay;
		System.out.printf("所持金%d%n",money);
		int returnmoney=a.dataPrint(pay);
		System.out.println(a.buymoney);
		money+=returnmoney;
		System.out.printf("所持金%d%n",money);
	}
}

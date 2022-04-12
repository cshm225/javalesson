import java.util.*;
public class Jihanki{
		int returnmoney=0;
		int buymoney;//商品の値段返還変数
		int num;//商品番号
		String data[][]={
			{"水","100"},
			{"コーラ","120"},
			{"お茶","150"}
		};

	public Jihanki(){
		System.out.print("何を買いますか？0)水 100円 1)コーラ 120円 2)お茶150円");
		this.num=new Scanner(System.in).nextInt();
	}

	public int buy(){
		int sum=0;
		System.out.printf("%sの%s円です%n",this.data[this.num][0],this.data[this.num][1]);
		this.buymoney=Integer.parseInt(this.data[this.num][1]);
		do{
			System.out.print("お金を入れてください");
			int user_money=new Scanner(System.in).nextInt();
			System.out.printf("投入金額%d円\n",user_money);
			sum+=user_money;
			if(sum>=this.buymoney){
				break;
			}
			System.out.printf("お金が足りていません\n");
		}while(buymoney>=sum);
		return sum;
	}

	public int dataPrint(int sum){
		this.returnmoney=sum-this.buymoney;
		System.out.printf("商品の%sとおつりの%d円返却です%n",data[this.num][0],this.returnmoney);
		return this.returnmoney;
	}
}

import java.util.*;
public class Jihanki{
		int user_money[]=new int[1];
		int sum=0;
		int num;
		int returnmoney=0;
		int buymoney;
		String data[][]={
			{"水","100"},
			{"コーラ","120"},
			{"お茶","150"}
		};

	public Jihanki(){
		System.out.print("何を買いますか？0)水 100円 1)コーラ 120円 2)お茶150円");
		this.num=new Scanner(System.in).nextInt();
	}

	public void buy(int num){
		System.out.printf("%s%n",this.data[num][1]);
		buymoney=Integer.parseInt(this.data[num][1]);
		do{
			System.out.print("お金を入れてください");
			this.user_money[0]=new Scanner(System.in).nextInt();
			System.out.printf("投入金額%d円\n",this.user_money[0]);
			sum+=this.user_money[0];
			if(sum>=buymoney){
				break;
			}
			System.out.printf("お金が足りていません\n");
		}while(buymoney>=sum);
		dataPrint(this.data[num][0],buymoney);
	}

	public int dataPrint(String data,int buymoney){
		this.returnmoney=this.sum-buymoney;
		System.out.printf("商品の%sとおつりの%d円返却です%n",data,this.returnmoney);
		return this.returnmoney;
	}
}

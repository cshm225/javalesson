public class Jihanki{
	public Jihanki(){
		int num;
		int user_money=0;
		String data[][]={
			{"水","100"},
			{"コーラ","120"},
			{"お茶","150"}
		};
		System.out.print("何を買いますか？0)水 100円 1)コーラ 120円 2)お茶150円");
		num=new Scanner(System.in).nextInt();
	}
	public static void buy(String[] data,int num){
		System.out.printf("%s",this.data[num][1]);
		int buymoney=Integer.parseInt(this.data[num][1]);
		do{
			this.user_money+=;
			System.out.print("お金を入れてください");
			this.user_money=new Scanner(System.in).nextInt();
			System.out.printf("投入金額%d円\n",this.user_money);
			if(this.user_money>buymoney){
				break;
			}
			System.out.printf("お金が足りていません\n");
		}while(buymoney>this.user_money);
		dataPrint(this.user_money,data[num][0]);

	}

	public static int dataPrint(int money,String[][] data){

	}
}

import java.util.*;
public class Front{
	int balance;
	RoomInfomation hotel=new RoomInfomation();

	public void guide(int roomnum){
		int roomnumi=roomnum/10;
		int roomnumj=roomnum%10;
		System.out.printf("%dのお部屋ですね。基本料金は%d円です。\n",this.hotel.room[roomnumi][roomnumj],this.hotel.roomprice[roomnumi][roomnumj]);
		System.out.printf("ショート2時間(基本料金)(0)\n普通3時間(料金+1000円)(1)\nフリータイム(料金+2000円)(2)\n泊り(料金+3000円)(3)\nご利用時間を選択してください。");
		int timenum=new Scanner(System.in).nextInt();
		int allprice=allprice(roomnumi,roomnumj,timenum);
		System.out.printf("合計金額は%d円です.%n",allprice);
		System.out.printf("支払いお願いします.%n");
		int user_money=new Scanner(System.in).nextInt();
		returnBalance(allprice,user_money);
		System.out.printf("おつりは%d円です.",this.balance);

	}

	public int returnBalance(int allprice,int user_money){
		this.balance=user_money-allprice;
		return this.balance;
	}

	public int allprice(int roomnumi,int roomnumj,int timenum){
		int allprice;
		allprice=this.hotel.roomprice[roomnumi][roomnumj]+this.hotel.timeprice[timenum];
		return allprice;
	}
}

import java.util.*;
public class Front{
	int balance;
	RoomInfomation hotel=new RoomInfomation();
	public void guide(int roomnum){
	int roomnumi=roomnum/10;
	int roomnumj=roomnum%10;
	System.out.printf("%dのお部屋ですね。基本料金は%d円です。\n",this.room[roomnumi][roomnumj],this.roomprice[roomnumi]);
	System.out.printf("ショート2時間(基本料金)(0)\n普通3時間(料金+1000円)(1)\nフリータイム(料金+2000円)(2)\n泊り(料金+3000円)(3)\nご利用時間を選択してください。");
	int timenum=new Scanner(System.in).nextInt();
	int allprice=allprice(timenum);
	System.out.printf("合計金額は%d円です.",allprice);
	
	}
	public int returnBalance(int time,user_money){

	
	}
	public int allprice(roomnumi,roomnumj,timenum){
		int allprice;
		allprice=this.hotel.roomprice[roomnumi][roomnumj]+this.hotel.roomprice[timenum];
		return allprice;
	}
}

import java.util.*;
public class Nagatsu2{
	public static void main(String[] args){
		System.out.print("制限時間(時間)");
		int hour=new Scanner(System.in).nextInt();
		System.out.printf("太郎が%d匹、二郎が%d匹、三郎が%d匹の魚を釣りました",taro(hour),jiro(hour),saburo(hour));
	}
	static int taro(int hour){
		return hour*4;
	}
	static int jiro(int hour){
		int jirornd=0;
		Random rnd=new Random();
		int fish=0;
		for(int i=0;i<hour;i++){
			jirornd=rnd.nextInt(10);
			switch(jirornd){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					fish+=5;
					break;
				case 7:
				case 8:
				case 9:
					fish+=2;
					break;
			}
		}
		return fish;
	}
	static int saburo(int hour){
		int saburornd=0;
		Random rnd=new Random();
		int fish=0;
		for(int i=0;i<hour;i++){
			saburornd=rnd.nextInt(10);
			switch(saburornd){
				case 0:
				case 1:
				case 3:
				case 2:
				case 4:
				case 5:
				case 6:
				case 7:
					fish+=6;
					break;
				case 8:
				case 9:
					fish=0;
					break;
			}
		}
		return fish;
	}
}

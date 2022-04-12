import java.util.*;
public class RoomNumberMachine{
	public int machine(){
		System.out.println("いらっしゃいませ。");
		RoomInfomation hotel=new RoomInfomation();
		System.out.printf("部屋番号を選択してください\n");
		System.out.println("---------------------");
		for(int i=0;i<room.length;i++){
			System.out.print("|");
			for(int j=0;j<room[i].length;j++){
				System.out.printf("%d(%d%d)|",hotel.room[i][j],i,j);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		int RoomNum=new Scanner(System.in).nextInt();
		return RoomNum;
	}
}

import java.util.*;
public class Nagano{
	public static void main(String[] args){
		int weather,gender;
		String animalgender="null";
		System.out.println("天気を選択する。１晴れ２曇り３雨");
		weather=new Scanner(System.in).nextInt();
		gender=new Random().nextInt(2);
		if(gender==0){
			animalgender="オス";
		}else if(gender==1){
			animalgender="メス";
		}

		if(weather==1){
			System.out.println("箱の中の動物はキリンで"+animalgender);
		}else if(weather==2){		
			System.out.println("箱の中の動物はイヌで"+animalgender);
		}else if(weather==3){
			System.out.println("箱の中の動物はネコで"+animalgender);
		}
	}
}

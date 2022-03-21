import java.util.*;
public class Ex6{
	public static void main(String[] args){
		int selected;
		System.out.print("[メニュー]1:検索2:登録3:削除4:変更");
		selected=new Scanner(System.in).nextInt();
		switch(selected){
			case 1:
				System.out.println("検索");
				break;
			case 2:
				System.out.println("登録");
				break;
			case 3:
				System.out.println("削除");
				break;
			default:
			
		}
	}
}

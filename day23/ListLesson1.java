import java.util.*;
public class ListLesson1{
	public static void main(String[] args){
		ArrayList<Integer> nums=new ArrayList<>();
		while(true){
			int select;
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			select=new Scanner(System.in).nextInt();
			if(select==0)break;
			nums.add(select);
			System.out.printf("%dをListに追加したよ！\n",select);
		}
		System.out.println("--結果--");
		System.out.printf("要素数:%d\n",nums.size());
		System.out.printf("要素:%s\n",nums);
	}
}

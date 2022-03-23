import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 * さいころ降って奇数か偶数か
		 * 実行けっか
		 * 4は偶数
		 */
		int num,number;
		num=new Random().nextInt(6)+1;
		number=num%2;
		if(number==0){
			System.out.println(num+"偶数です");
		}else{
			System.out.println(num+"奇数です");
		}
	}
}

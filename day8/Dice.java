import java.util.*;
public class Dice{
	public static void main(String[] args){
		int dice=new Random().nextInt(6)+1;
		/*if(dice%2==0){
			System.out.printf("%dは偶数です%n",dice);
		}else{
			
			System.out.printf("%dは奇数です%n",dice);
		}*/

		String result=dice%2==0?"偶数":"奇数";//条件演算子三項演算子
		System.out.printf("%dは%sです%n",dice,result);
	}
}

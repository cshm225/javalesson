import java.util.*;
public class ArrayLesson{
	public static void main(String[] args){
		/*配列とは
		 * 配列:値をまとまった塊として扱う技術*/
		String[] hands={"グー","チョキ","パー"};
		String hand;
		System.out.print("手を入力0グー1チョキ2パー");
		int you=new Scanner(System.in).nextInt();
		int pc=new Random().nextInt(hands.length);
		System.out.println("pcは"+hands[pc]+"あなたは"+hands[you]);
		if(pc==you){
		System.out.print("あいこ");
		}else if((you+3-pc)%3==2){
		System.out.print("勝ち");
		}else{
		System.out.print("make");
		}
	}
}

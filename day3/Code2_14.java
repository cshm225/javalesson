import java.util.*;
public class Code2_14{
	public static void main(String[] args){
		int r=new java.util.Random().nextInt(90);//0~89の90 nextInt(6)+5 5~10がでる
		//nextInt(大きい数+小さい数+1)+小さい数
		System.out.println("あなたはたぶん、"+r+"歳ですね？");
	}
}

import java.util.*;
public class Ex2_3{
	public static void main(String[] args){
		String name;
		String ageString;
		int age;
		int fortune=new Random().nextInt(4);
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前は？");
		name=new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢は？");
		ageString=new Scanner(System.in).nextLine();
		age=Integer.parseInt(ageString);
		fortune++;
		System.out.println("結果でました");	
		System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
		System.out.println("1:大吉2:中吉3:吉4:凶");
		
		
	}
}

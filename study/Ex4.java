import java.util.*;
public class Ex4{
	public static void main(String[] args){
	String name="";
	String ageString="";
	int age,fortune;

	System.out.println("ようこそ");
	System.out.println("あなたの名前は？");
	name=new Scanner(System.in).nextLine();
	System.out.println("あなたのnenreiwa？");
	ageString=new Scanner(System.in).nextLine();
	age=Integer.parseInt(ageString);
	fortune=new Random().nextInt(4);
	fortune++;
	System.out.println("結果でました");
	System.out.println(age+"歳"+name+"sanunkiha"+fortune);
	}
}

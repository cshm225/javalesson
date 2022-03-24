import java.util.*;
public class Highlow{
	public static void main(String[] args){
		int n,m;
		n=new Random().nextInt(13)+1;
		m=new Random().nextInt(13)+1;
		System.out.println("今のカードは"+n+"です");
		System.out.print("さて次のカードはこのカードより(high or low)?>>");
		String ans=new Scanner(System.in).next();
		System.out.println(m);
		if(ans.equalsIgnoreCase("High") && n<m || ans.equalsIgnoreCase("Low") && n>m){
			System.out.println("You Win!!");
		}else{
			System.out.println("You Lose...");
		}
	}
}

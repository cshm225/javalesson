import java.util.*;
public class Akita{
	public static void main(String[] args){
	int n,m;
	n=new Random().nextInt(13)+1;
	m=new Random().nextInt(13)+1;
	System.out.println("今の数は"+n+"です。ハイorロー？");
	String highlow=new Scanner(System.in).nextLine();
	if(highlow.equals("ロー")){
		if(n>m){
			System.out.println(n+"←"+m+"あなたの勝ち");
		}else if(n<m){
			System.out.println(n+"←"+m+"あなたの負け");
		}
	}else if(highlow.equals("ハイ")){
		if(n>m){
			System.out.println(n+"←"+m+"あなたの負け");
		}else if(n<m){
			System.out.println(n+"←"+m+"あなたの勝ち");
		}
	}	
	}	
}

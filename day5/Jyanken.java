import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		/*
		 *手を入力グー0 チョキ1 パー2
		 あなたはtyoki,pcはpa-
		 あなたのかち
		 */
		int n,pc;
		System.out.println("手を入力 グー:0 チョキ:1 パー:2");
		n=new Scanner(System.in).nextInt();
		pc=new Random().nextInt(3);
		if(n==0 && pc==0){
			String name="グー";
			String pcname="グー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("ひきわけ");		
		}else if(n==1 && pc==1){
			String name="チョキ";
			String pcname="チョキ";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("ひきわけ");		
			
		}else if(n==2 && pc==2){
			String name="パー";
			String pcname="パー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("ひきわけ");		
		}else if(n==0 && pc==1){
			String name="グー";
			String pcname="チョキー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたのかち");		
		}else if(n==1 && pc==2){
			String name="チョキー";
			String pcname="パー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたのかち");		
		}else if(n==2 && pc==0){
			String name="パー";
			String pcname="グー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたのかち");		
		}else if(n==0 && pc==2){
			String name="グー";
			String pcname="パー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたのまけ");		
		}else if(n==1 && pc==0){
			String name="チョキ";
			String pcname="グー";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたの負け");		
		}else if(n==2 && pc==1){
			String name="パー";
			String pcname="チョキ";
			System.out.println("あなたは"+name);
			System.out.println("相手は"+pcname);
			System.out.println("あなたの負け");		
		}
			
		/*if(n==pc){
			System.out.println("ひきわけ");		
		}else if(n==0 && pc==1 || n==1 && pc==2 || n==2 && pc==0){
			System.out.println("あなたの勝ち");
		}else if(n==0 && pc==2 || n==1 && pc==0 || n==2 && pc==1){
			System.out.println("あなたの負け");
		}*/
	}
}

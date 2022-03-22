import java.util.*; 
public class Ex7{
	public static void main(String[] args){
		int i,num,ans;
		System.out.println("数当てゲーム");
		for(i=0;i<5;i++){
			System.out.println("数字を入力してください");
			num=new Scanner(System.in).nextInt();	
			ans=new Random().nextInt(10);
			if(num==ans){
				System.out.println("アタリ");
			}
			if(num!=ans){
				System.out.println("はずれ");
			}
		}
			System.out.println("owari");
	}
}

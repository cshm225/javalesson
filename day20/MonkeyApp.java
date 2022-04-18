import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("おさるの名前を決めてください:>");
		m.name=scan.nextLine();
		System.out.print("おさるの歳を決めてください:>");
		m.old=scan.nextInt();
		Monkey m=new Monkey(name,old);
		int num;
		do{
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了");
			num=scan.nextInt();
			if(num==1){
				m.hello();
			}
			if(num==2){
				m.takeuma();
			}
			if(num==3){
				m.sakadati();
			}
			if(num==4){
				m.end();
			}
		}while(num!=4);

	}
}

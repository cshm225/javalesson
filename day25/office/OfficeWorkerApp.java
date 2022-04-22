import java.util.*;
public class OfficeWorkerApp{
	public static void main(String[] args){
		final int num=3;
		OfficeWorker ow[]=new OfficeWorker[num];
		System.out.println("あなたの部下に3人配属されました");	
		Random rndm=new Random();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<num;i++){
			System.out.printf("%d人目の名前を入力してください",i+1);
			String name=scan.next();
			int rnd=rndm.nextInt(3);
			if(rnd==0){
				ow[i]=new OrdinaryOfficeWorker(name);
			}
			if(rnd==1){
				ow[i]=new EliteOfficeWorker(name);
			}
			if(rnd==2){
				ow[i]=new LazyOfficeWorker(name);
			}
		}
		while(true){
			System.out.println("誰の働きぶりを見にいきますか?");
			System.out.printf("0...%s\n1...%s\n2...%s\n3...終了\n",ow[0].name,ow[1].name,ow[2].name);
			int select=scan.nextInt();
			if(select==3)break;
			if(select==0){
				ow[0].work();
			}
			if(select==1){
				ow[1].work();
			}
			if(select==2){
				ow[2].work();
			}
		}
	}
}
abstract class OfficeWorker{
	String name;
	OfficeWorker(String name){
		this.name=name;
		this.introduce();
	}
	public void introduce(){
		System.out.printf("はじめまして。私は%sです。\n",this.name);
	}
	public abstract void work();
}
class OrdinaryOfficeWorker extends OfficeWorker{
	OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない\n",this.name);
	}
}
class LazyOfficeWorker extends OfficeWorker{
	LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう\n",this.name);
	}
}
class EliteOfficeWorker extends OfficeWorker{
	EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ\n",this.name);
	}
}

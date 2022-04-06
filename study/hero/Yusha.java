import java.util.*;
public class Yusha{
	String name="輝";
	int hp;
	Sword sword;
	public void attack(){
		System.out.printf("%sは%sで攻撃した",this.name,this.sword.name);
	}
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した");
		System.out.printf("%sです",this.name);
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は"+sec+"秒座った");
		System.out.println(this.name+"は"+sec+"回復した");

	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は転んだ");
		System.out.println("5のダメージ");
	}
	public void run(){
		
		System.out.printf(this.name+"は逃げ出した\ngameover\n最終hpは%dでした",this.hp);
	}
	public Yusha(String name){
		this.hp=100;
		this.name=name;
	}
	public Yusha(){
		this("ダミー");
	}
}

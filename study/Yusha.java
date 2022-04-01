import java.util.*;
public class Yusha{
	String name="輝";
	int hp;
	public void attack(){
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
}

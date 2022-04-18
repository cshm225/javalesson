import java.util.*;
public class Hero{
	String name;
	int hp;
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は眠って回復した!");

	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った");
	}
	public void slip(){
		this.hp -=5;
		System.out.println(this.name+"は転んだ");
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は逃げた");
		System.out.println("gameover");
		System.out.println(this.name+"の最終hpは"+this.hp);
	}
}

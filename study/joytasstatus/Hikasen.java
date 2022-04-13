import java.util.*;
public class Hikasen{
	String name;
	int hp;
	int power;
	int magicpower;
	int dex;
	int speed;
	public Hikasen(String name){
		Random rnd=new Random();
		int status=350;
		this.name=name;
		this.hp=rnd.nextInt(100)+1;
		this.power=rnd.nextInt(50)+1;
		this.magicpower=rnd.nextInt(100)+1;
		this.dex=rnd.nextInt(50)+1;
		this.speed=rnd.nextInt(50)+1;
	}
}

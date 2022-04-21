public class MonsterApp{
	public static void main(String[] args){
		Goblin g = new Goblin(50,20);
		Wearwolf ww=new Wearwolf(120,30);
		Deathbat db = new Deathbat(30,20);
		g.attack();
		ww.attack();
		db.attack();
		g.run();
		ww.run();
		db.run();
	}
}
abstract class Monster{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	abstract void attack();
	abstract void run();
}
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	abstract void attack();
	@Override
	void run(){
		System.out.println("tokotokonigeta");
	}
}
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	abstract void attack();
	@Override
	void run(){
		System.out.println("basabasanigeta");
	}
}
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("knife attack");
	}
	void run(){
		super.run();
	}
}
class Wearwolf extends WalkingMonster{
	Wearwolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("kamituku");
	}
	void run(){
		super.run();
	}
}
class Deathbat extends FlyingMonster{
	Deathbat(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("tutuku");
	}
	void run(){
		super.run();
	}

}

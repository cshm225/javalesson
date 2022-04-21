public class Hero{
	String name="ミナト";
	int hp=100;
	public Hero(){
		System.out.println("hero");
	}
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃");
		m.hp-=5;
		System.out.println("5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
}
class Matango{
	int hp=50;
	char suffix;
	Matango(char suffix){
		this.suffix=suffix;
	}
 void attack(Hero h){
		System.out.println("キノコ"+this.suffix+"の攻撃");
		System.out.println("10のダメージ");
		h.hp-=10;
	}
}
class  PoisonMatango extends Matango{
	int poisoncount=5;
	PoisonMatango(char suffix){
		super(suffix);
	}
	@Override
	void attack(Hero h){
		super.attack(h);
		if(poisoncount<=0){
			return;
		}
		System.out.println("毒攻撃");
		int damage=h.hp/5;
		h.hp-=damage;
		System.out.printf("%dダメージ\n",damage);
		poisoncount--;
	}

}

public class PoisonMatango extends Matango{
	int poisonattacknum=5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	public void attack(Hero h){
		super.attack(h);
		if(poisonattacknum!=0){
			System.out.println("さらに毒の攻撃をばらまいた");
			int damage=h.hp*0.2;
			h.hp-=damage;
			System.out.println(damage+"ポイントのダメージ");
			this.poisonattacknum--;
		}
	}
}

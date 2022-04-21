public class Main{
	public static void main(String[] args){
		SuperHero sh=new SuperHero();
		Hero h=new Hero();
		h.run();
		sh.run();
		Matango m=new Matango('a');
		m.hp=10;
		h.attack(m);
		sh.flying=true;
		sh.attack(m);
		PoisonMatango m1=new PoisonMatango('b');
		m1.attack(h);
	}
}

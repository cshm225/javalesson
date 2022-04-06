public class Wizard{
	String name;
	int hp;
	public void heal(Yusha h){
		h.hp+=10;
		System.out.printf("%sのHpを10回復した%n",h.name);

	}
}

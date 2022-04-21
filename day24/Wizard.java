public class Wizard extends Character{
	int mp;
	Wizard(String name){
		super(name);
	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"のファイア");
		m.hp-=5;

	}
}

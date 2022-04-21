public class Mmain{
	public static void main(String[] args){
	//	Character c=new Character();
		Dancer d=new Dancer("a!");
		Matango m=new Matango();
		m.hp=10;
		d.attack(m);
		Wizard w=new Wizard("w");
		w.attack(m);
	}
}

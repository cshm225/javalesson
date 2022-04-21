public class Dancer extends Character{
	Dancer(String name){
		super(name);
	}
	public void dance(){
		this.name=name;
		System.out.println(this.name+"は踊った");

}
@Override
public void attack(Matango m){
	System.out.println(this.name+"の攻撃");
	
}
}

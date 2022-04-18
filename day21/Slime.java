public class Slime{
	String name;
	int power;
	public Slime(String name,int power){
		this.name=name;
		this.power=power;
		this.appear();
	}
	public void appear(){
		System.out.printf("%sが現れた\n",this.name);
	}
	public void attack(){
		System.out.printf("%sは%dのダメージを与えた.\n",this.name,this.power);
	}
}
